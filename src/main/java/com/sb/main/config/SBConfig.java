package com.sb.main.config;

import java.sql.SQLException;
import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import com.atomikos.jdbc.AtomikosDataSourceBean;
import com.mysql.cj.jdbc.MysqlXADataSource;
import com.sb.main.DBConfig.SBDatasourceProperties;

@Configuration
@DependsOn("transactionManager")
@EnableJpaRepositories(basePackages = "com.sb.main.repository", entityManagerFactoryRef = "sbEntityManager", transactionManagerRef = "transactionManager")
@EnableConfigurationProperties(SBDatasourceProperties.class)
public class SBConfig {

	@Autowired
	private JpaVendorAdapter jpaVendorAdapter;

	@Autowired
	private SBDatasourceProperties SBDatasourceProperties;

	@Primary
	@Bean(name = "sbDataSource", initMethod = "init", destroyMethod = "close")
//	@Qualifier("sbDataSource")
	public DataSource sbDataSource() throws SQLException {
		MysqlXADataSource mysqlXaDataSource = new MysqlXADataSource();
		mysqlXaDataSource.setUrl(SBDatasourceProperties.getUrl());
		mysqlXaDataSource.setPinGlobalTxToPhysicalConnection(true);
		mysqlXaDataSource.setPassword(SBDatasourceProperties.getPassword());
		mysqlXaDataSource.setUser(SBDatasourceProperties.getUsername());
		mysqlXaDataSource.setPinGlobalTxToPhysicalConnection(true);

		AtomikosDataSourceBean xaDataSource = new AtomikosDataSourceBean();
		xaDataSource.setXaDataSource(mysqlXaDataSource);
		xaDataSource.setUniqueResourceName("xads1");
		return xaDataSource;

	}

	@Primary
	@Bean(name = "sbEntityManager")
	@DependsOn("transactionManager")
	public LocalContainerEntityManagerFactoryBean sbEntityManager() throws Throwable {

		HashMap<String, Object> properties = new HashMap<String, Object>();
		properties.put("hibernate.transaction.jta.platform", AtomikosJtaPlatform.class.getName());
		properties.put("javax.persistence.transactionType", "JTA");

		LocalContainerEntityManagerFactoryBean entityManager = new LocalContainerEntityManagerFactoryBean();
		entityManager.setJtaDataSource(sbDataSource());
		entityManager.setJpaVendorAdapter(jpaVendorAdapter);
		entityManager.setPackagesToScan("com.sb.main.entity");
		entityManager.setPersistenceUnitName("sbPersistenceUnit");
		entityManager.setJpaPropertyMap(properties);
		return entityManager;
	}

}
