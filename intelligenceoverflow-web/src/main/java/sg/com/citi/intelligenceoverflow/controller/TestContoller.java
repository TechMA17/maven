package sg.com.citi.intelligenceoverflow.controller;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import sg.com.citi.intelligenceoverflow.service.Extractor;

@Model
public class TestContoller {

	
    @Inject
    private Extractor extractor;
	public void test() {
		extractor.testFunction();
	}
	
}
