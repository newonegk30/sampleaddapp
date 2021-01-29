package com.sampleadd.controller;

import static java.util.Objects.nonNull;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.sampleadd.model.SampleAddResponse;


@RestController
public class SampleAddController {

        private double dnum = 0.0;
        private double tnum = 0.0;
	
	@RequestMapping(method = RequestMethod.POST , path="/{num1}/{num2}" , produces = "application/json")

	public SampleAddResponse sampleAddArthmetic(@PathVariable(required = false) String num1, @PathVariable(required = false) String num2) {
		
		SampleAddResponse sampleAddResp = new SampleAddResponse();
		Gson g = new Gson();
		if (num1 == null || num1.trim().length() == 0 ) {
                     tnum = dnum ; 
                 }
		else {
			try {
			   dnum = Double.parseDouble(num1) ;
			   tnum = dnum;
                        }
			catch (NumberFormatException ex)
                        {
				dnum = 0.0 ;
				tnum = 0.0 ;
                        }
                 }

		if (num2 == null || num2.trim().length() == 0 ) {
                        tnum = dnum + 10.0 ;
                }
                else  {
			try {
                               dnum = Double.parseDouble(num2) ;
                        }
			catch (NumberFormatException ex) {
                             dnum = 0.0 ; 
			}
			tnum = tnum + dnum;
                }
		sampleAddResp.setTotal(tnum);
		return  g.fromJson(sampleAddResp.outResp(), SampleAddResponse.class) ;

	}
	
}
