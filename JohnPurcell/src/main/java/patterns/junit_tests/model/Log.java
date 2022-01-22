package patterns.junit_tests.model;

import lombok.Data;

import java.util.Date;

@Data
public class Log {
	private int id;
	private Date date;
	private String message;
}