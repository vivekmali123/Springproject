package com.mbi.leave.approval;


import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("LeaveAutoApproval")
	public class LeaveAutoApproval implements JavaDelegate {
		private final Logger LOGGER = Logger.getLogger(LeaveAutoApproval.class.getName());

		public void execute(DelegateExecution execution) throws Exception {

			LOGGER.info("Leave auto approved...!!!");
			
			String approvalstatus="Approved By Hr";
			execution.setVariable("approvalstatus", approvalstatus);		
		}	
}