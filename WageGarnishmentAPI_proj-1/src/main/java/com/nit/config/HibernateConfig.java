package com.nit.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class HibernateConfig {

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		System.out.println("inside hibernate util class");
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(new String[] { "com.nit.entity" });
		sessionFactory.setHibernateProperties(hibernateProperties());
		return sessionFactory;
	}

	@Bean
	public DataSource dataSource() {
		System.out.println("inside datasource");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/wage_garnishment");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		return dataSource;
	}

	private Properties hibernateProperties() {

		Properties properties = new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		properties.put("hibernate.show_sql", true);
		properties.put("hibernate.format_sql", false);
		return properties;
	}

	@Bean
	public HibernateTransactionManager transactionManager(SessionFactory factory) {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(factory);
		return txManager;
	}

	/*
	 * @Bean public SessionFactory sessionFactory(HibernateEntityManagerFactory
	 * hemf){ return hemf.getSessionFactory(); }
	 */

	/*
	 * private static SessionFactory sessionFactory;
	 * 
	 * public static SessionFactory getSessionFactory() { if (sessionFactory ==
	 * null) { try { Configuration configuration = new Configuration(); // Hibernate
	 * settings equivalent to hibernate.cfg.xml's properties Properties settings =
	 * new Properties(); settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
	 * settings.put(Environment.URL,
	 * "jdbc:mysql://localhost:3306/contactdb?useSSL=false");
	 * settings.put(Environment.USER, "root"); settings.put(Environment.PASS, "");
	 * settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
	 * settings.put(Environment.SHOW_SQL, "true");
	 * settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread"); //
	 * settings.put(Environment.HBM2DDL_AUTO, "create-drop");
	 * configuration.setProperties(settings); //
	 * configuration.addAnnotatedClass(.class); ServiceRegistry serviceRegistry =
	 * new StandardServiceRegistryBuilder()
	 * .applySettings(configuration.getProperties()).build(); sessionFactory =
	 * configuration.buildSessionFactory(serviceRegistry); } catch (Exception e) {
	 * e.printStackTrace(); } } return sessionFactory; }
	 */

}
