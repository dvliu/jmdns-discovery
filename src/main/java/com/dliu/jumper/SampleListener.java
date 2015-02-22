package com.dliu.jumper;

import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;
import javax.jmdns.ServiceTypeListener;

class SampleListener implements ServiceListener, ServiceTypeListener {
	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.jmdns.ServiceListener#serviceAdded(javax.jmdns.ServiceEvent)
	 */
	public void serviceAdded(final ServiceEvent event) {
		System.out.println("ADD: " + event);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.jmdns.ServiceListener#serviceRemoved(javax.jmdns.ServiceEvent)
	 */
	public void serviceRemoved(final ServiceEvent event) {
		System.out.println("REMOVE: " + event);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.jmdns.ServiceListener#serviceResolved(javax.jmdns.ServiceEvent)
	 */
	public void serviceResolved(final ServiceEvent event) {
		System.out.println("RESOLVED: " + event);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.jmdns.ServiceTypeListener#serviceTypeAdded(javax.jmdns.ServiceEvent
	 * )
	 */
	public void serviceTypeAdded(final ServiceEvent event) {
		System.out.println("TYPE: " + event);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.jmdns.ServiceTypeListener#subTypeForServiceTypeAdded(javax.jmdns
	 * .ServiceEvent)
	 */
	public void subTypeForServiceTypeAdded(final ServiceEvent event) {
		System.out.println("SUBTYPE: " + event);
	}
}