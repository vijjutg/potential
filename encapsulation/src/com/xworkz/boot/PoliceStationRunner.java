package com.xworkz.boot;

import com.xworkz.encapsulation.Police;
import com.xworkz.encapsulation.PoliceStation;

public class PoliceStationRunner {

	public static void main(String[] args) {

		Police police = new Police();

		police.display();

		PoliceStation station1 = new PoliceStation();

		station1.setNoOfCells(8);

		station1.setNoOfGuns(5);

		System.out.println(station1.getNoOfCells());

		System.out.println(station1.getNoOfGuns());

		station1.colorOfBuild = "White";

		station1.flagpole = true;

		station1.noOfLadyCops = 5;

		station1.steps = false;

		System.out.println(station1.colorOfBuild);

		System.out.println(station1.flagpole);

		System.out.println(station1.noOfLadyCops);

		System.out.println(station1.steps);

	}

}
