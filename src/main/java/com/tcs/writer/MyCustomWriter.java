package com.tcs.writer;

import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.transform.BeanWrapperFieldExtractor;
import org.springframework.batch.item.file.transform.DelimitedLineAggregator;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import com.tcs.entity.Employee;

@Component
public class MyCustomWriter extends FlatFileItemWriter<Employee> {

	public MyCustomWriter() {
		setResource(new FileSystemResource("data/output.csv"));
		setLineAggregator(getDelimitedLineAggregator());
	}
	
	public DelimitedLineAggregator<Employee> getDelimitedLineAggregator() {
		BeanWrapperFieldExtractor<Employee> beanWrapperFieldExtractor = new BeanWrapperFieldExtractor<Employee>();
		beanWrapperFieldExtractor.setNames(new String[] {"id", "name", "salary"});

		DelimitedLineAggregator<Employee> delimitedLineAggregator = new DelimitedLineAggregator<Employee>();
		delimitedLineAggregator.setDelimiter(",");
		delimitedLineAggregator.setFieldExtractor(beanWrapperFieldExtractor);
		return delimitedLineAggregator;
		
	}
}

