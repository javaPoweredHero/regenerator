package com.regenerator.regenerator;

import com.regenerator.regenerator.data.DataType;
import com.regenerator.regenerator.service.api.ConvertationService;
import com.regenerator.regenerator.web.requests.ConvertationRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.io.File;
import java.io.InputStream;
import java.net.URL;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RegeneratorApplicationTests {

	@Autowired
	ConvertationService convertationService;

	@Test
	public void testGoogleFeedConversion() {
		ClassLoader classLoader = getClass().getClassLoader();
		URL resource = classLoader.getResource("test_google.xml");
		Assert.notNull(resource, "file not found");
		File file = new File(resource.getFile());
		Assert.isTrue(convertationService.xmlToCsv(buildGoogleRequest(file)), "response must be ok");
	}

	@Test
	public void testYmlConversion() {
		ClassLoader classLoader = getClass().getClassLoader();
		URL resource = classLoader.getResource("test_yml.xml");
		Assert.notNull(resource, "file not found");
		File file = new File(resource.getFile());
		Assert.isTrue(convertationService.xmlToCsv(buildYmlRequest(file)), "response must be ok");
	}

	private ConvertationRequest buildGoogleRequest(File file) {
		return new ConvertationRequest()
				.setDataType(DataType.GOOGLE)
				.setInputFilePath(file.getAbsolutePath())
				.setOutputFilePath(generateResultFilePath(file.getAbsolutePath()));
	}

	private ConvertationRequest buildYmlRequest(File file) {
		return new ConvertationRequest()
				.setDataType(DataType.YML)
				.setInputFilePath(file.getAbsolutePath())
				.setOutputFilePath(generateResultFilePath(file.getAbsolutePath()));
	}

	private String generateResultFilePath(String inputFilePath) {
		int lastDot = inputFilePath.lastIndexOf('.');
		return inputFilePath.substring(0,lastDot) + "_result" + ".csv";
	}
}
