package javaConvention.view;

import org.eclipse.ui.views.markers.MarkerSupportView;

public class JCCMarkerView extends MarkerSupportView {

	public JCCMarkerView(String contentGeneratorId) {
//		super("Java Convention Plugin.markerContentGenerator");
		super("com.eclipse-tips.markers.myCustomMarkerGenerator"); 
	}

}
