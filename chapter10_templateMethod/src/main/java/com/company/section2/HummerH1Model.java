package com.company.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class HummerH1Model extends HummerModel {
	//H1�ͺŵĺ���������
	@Override
	public void alarm() {
		System.out.println("����H1����...");
	}

	//���������
	@Override
	public void engineBoom() {
		System.out.println("����H1����������������...");
	}

	//��������
	@Override
	public void start() {
		System.out.println("����H1����...");
	}
	
	//ͣ��
	@Override
	public void stop() {
		System.out.println("����H1ͣ��...");
	}
	

}