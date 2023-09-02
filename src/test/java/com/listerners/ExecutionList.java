package com.listerners;

import org.testng.IExecutionListener;

public class ExecutionList implements IExecutionListener{
	@Override

    public void onExecutionStart() {

        // TODO Auto-generated method stub

        System.out.println("Started");

    }

 

    @Override

    public void onExecutionFinish() {

        // TODO Auto-generated method stub

        System.out.println("Finish");

    }

}
