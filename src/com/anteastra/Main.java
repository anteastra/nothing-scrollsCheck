package com.anteastra;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;

public class Main {
	public static void main(String[] args){
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		boolean isOn = toolkit.getLockingKeyState(KeyEvent.VK_SCROLL_LOCK);
		
		toolkit.setLockingKeyState(KeyEvent.VK_SCROLL_LOCK,!isOn);
	}
}
