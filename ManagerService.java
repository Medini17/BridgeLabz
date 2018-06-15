/**
 * 
 */
package com.bridgelabz.oops;

import java.io.IOException;
import java.text.ParseException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * Purpose:
 */

public interface ManagerService {

	public void addDoctor() throws Exception;

	public void updateDoctor() throws Exception;

	public void deleteDoctor() throws Exception;

	public void addPatient() throws Exception;

	public void deletePatient() throws Exception;

	public void updatePatient() throws Exception;

}