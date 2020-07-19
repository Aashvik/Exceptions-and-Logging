package com.aashvik.exceptionlogging;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConstructionPriceTEst {

	@Test
	void constructionCostStandard()
	{
		ConstructionPrice standardMaterial=new ConstructionPrice();
		standardMaterial.takeInputParameters(55,"standard",false);
		double constructionPrice=standardMaterial.calConstructionCost();
		assertEquals(66000,constructionPrice,1);
	}
	@Test
	void constructionCostAboveStandard()
	{
		ConstructionPrice aboveStandardMaterial=new ConstructionPrice();
		aboveStandardMaterial.takeInputParameters(60,"aboveStandard");
		double constructionPrice=aboveStandardMaterial.calConstructionCost();
		assertEquals(90000,constructionPrice,1);
	}
	@Test
	void constructionCostHighStandard()
	{
		ConstructionPrice highStandardMaterial=new ConstructionPrice();
		highStandardMaterial.takeInputParameters(100,"highStandard",false);
		double constructionPrice=highStandardMaterial.calConstructionCost();
		assertEquals(180000,constructionPrice,1);
	}
	@Test
	void constructionCostHighStandardAutoHome()
	{
		ConstructionPrice highStandardMaterialAuto=new ConstructionPrice();
		highStandardMaterialAuto.takeInputParameters(400,"highStandard",true);
		double constructionPrice=highStandardMaterialAuto.calConstructionCost();
		assertEquals(1000000,constructionPrice,1);
	}
}
