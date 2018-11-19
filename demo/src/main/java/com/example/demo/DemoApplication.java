package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner{
	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);
    @Autowired
    JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Override
	public void run(String... strings) throws Exception {


		log.info("Creating tables");
		jdbcTemplate.execute("DROP TABLE student_tbl IF EXISTS");
		jdbcTemplate.execute("CREATE TABLE student_tbl (\n" +
				"  id IDENTITY NOT NULL ,\n" +
				"  name VARCHAR (255) NOT NULL ,\n" +
				"  surname VARCHAR(255) NOT NULL,\n" +
				"  phone INT NOT NULL,\n" +
				"  city VARCHAR(255) NOT NULL,\n" +
				"  district VARCHAR(255) NOT NULL,\n" +
				"  description VARCHAR(255) NOT NULL\n" +
				");");

		jdbcTemplate.execute("INSERT INTO student_tbl (name, surname, phone, city, district,description) VALUES ('sdsdf', 'ererer', '7894', 'FF', 'DD', 'ERTG');");
		jdbcTemplate.execute("INSERT INTO student_tbl (name, surname, phone, city, district,description) VALUES ('dsd', 'ererer', '7894', 'FF', 'DD', 'ERTG');");
		jdbcTemplate.execute("INSERT INTO student_tbl (name, surname, phone, city, district,description) VALUES ('sdsdf', 'ererer', '7894', 'FF', 'DD', 'ERTG');");
		jdbcTemplate.execute("INSERT INTO student_tbl (name, surname, phone, city, district,description) VALUES ('sdsdf', 'ererer', '7894', 'FF', 'DD', 'ERTG');");
		jdbcTemplate.execute("INSERT INTO student_tbl (name, surname, phone, city, district,description) VALUES ('sdsdf', 'ererer', '7894', 'FF', 'DD', 'ERTG');");
		jdbcTemplate.execute("INSERT INTO student_tbl (name, surname, phone, city, district,description) VALUES ('sdsdf', 'ererer', '7894', 'FF', 'DD', 'ERTG');");

		int count = jdbcTemplate.queryForObject("select count(*) from student_tbl", Integer.class);
		System.out.println(count+ " rows affected.");
	}


}
