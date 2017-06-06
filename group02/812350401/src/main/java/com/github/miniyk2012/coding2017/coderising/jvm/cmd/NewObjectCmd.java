package com.github.miniyk2012.coding2017.coderising.jvm.cmd;

import com.github.miniyk2012.coding2017.coderising.jvm.clz.ClassFile;
import com.github.miniyk2012.coding2017.coderising.jvm.constant.ConstantPool;
import com.github.miniyk2012.coding2017.coderising.jvm.engine.ExecutionResult;
import com.github.miniyk2012.coding2017.coderising.jvm.engine.StackFrame;

public class NewObjectCmd extends TwoOperandCmd{
	
	public NewObjectCmd(ClassFile clzFile, String opCode){
		super(clzFile,opCode);
	}

	@Override
	public String toString(ConstantPool pool) {
		
		return super.getOperandAsClassInfo(pool);
	}

	@Override
	public void execute(StackFrame frame, ExecutionResult result) {

	}


}
