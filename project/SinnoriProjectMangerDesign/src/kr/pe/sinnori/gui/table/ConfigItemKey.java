package kr.pe.sinnori.gui.table;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class ConfigItemKey extends JLabel {
	public ConfigItemKey(String text, String tooltipText) {
		this.setText(text);
		this.setToolTipText(tooltipText);
	}
}
