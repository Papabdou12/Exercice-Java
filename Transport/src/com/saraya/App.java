package com.saraya;

import com.saraya.cars.Bus;
import com.saraya.cars.PersonalCar;
import com.saraya.cars.Taxi;
import com.saraya.cars.users.Client;
import com.saraya.cars.users.Driver;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//TAXI
				
		Driver driver1 = new Driver("Dv1252","Madicke Ndongo",15000.10);
		Client client1 = new Client("Cl1475","Fary Seck","Thies","seckf12@gmail.com");
		Taxi taxi = new Taxi("Dk2132T",12,driver1,client1);
		taxi.getInfo();
		
		Driver driver2 = new Driver("D1252","Ibra Ndiaye",15000.12);
		Client client2 = new Client("Cl1212","Diarra Diouf","Thies","seckf12@gmail.com");
		Taxi taxi1 = new Taxi("Dk2256",13,driver2);
		taxi1.getInfo();
		
		
		//PersonalCar

		
		Driver driver3 = new Driver("Dv1252","Madicke Ndongo",15000.10);
		Client client3 = new Client("Cl1475","Fary Seck","Thies","seckf12@gmail.com");
		 PersonalCar personcar = new  PersonalCar("PC125",125,true,driver3,client3);
		 personcar.getInfo();
		 
		 Driver driver4 = new Driver("D1252","Ibra Ndiaye",15000.12);
			Client client4 = new Client("Cl1212","Diarra Diouf","Thies","seckf12@gmail.com");
			 PersonalCar personcar1 = new  PersonalCar("PC125",125,true,driver4,client4);
			 personcar1.getInfo();
			 
			
		
		//Bus
			 
			 Driver driver5 = new Driver("Dv1252","Madicke Ndongo",15000.10);
			 Bus bus = new Bus("DK-1452-F",52,driver5);
			 bus.getInfo();
			 
			 Driver driver6 = new Driver("D1252","Ibra Ndiaye",15000.12);
			 Bus bus1 = new Bus("TH-5236-D",52,driver6);
			 bus1.getInfo();
		
		
	}

}
