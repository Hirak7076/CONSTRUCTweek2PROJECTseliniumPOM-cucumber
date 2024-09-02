package Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Base.BaseTESTconstructWEEK;

public class ALLTESTS extends BaseTESTconstructWEEK {
	
	@Test(priority = 0)
	public void mensFOOTWARE() throws InterruptedException, IOException {
		
		MF.MFheader(Language);
		capture(driver, 1);
		//MF.MFMiddle(MensFootwearURL, BuyDISPLAY, MensFootwearSearch);
		MF.MFleftBAR();
		capture(driver, 2);
		MF.MFfooter(MensFootwearURL);
		capture(driver, 3);
		
		test.log(LogStatus.PASS, "Mens Footware PASS");
		test.log(LogStatus.FAIL, "Mens Footware FAIL");
		
	}
	
	@Test(priority = 11)
	public void bagPACK() throws InterruptedException, IOException {
		
		BP.BPheader(Language);
		capture(driver, 4);
		//BP.BPMiddle(BackpackSearch, BuyDISPLAY, sort1, sort2, sort3, sort4, sort5, sort6);
		BP.BPleftBAR(FromPrice, ToPrice);
		capture(driver, 5);
		BP.BPfooter(BackpackURL);
		capture(driver, 6);
		
		test.log(LogStatus.PASS, "Backpack PASS");
		test.log(LogStatus.FAIL, "Backpack FAIL");
		
	}
	
	@Test(priority = 2)
	public void boots() throws InterruptedException, IOException {
		
		B.Bheader(Language);
		capture(driver, 7);
		//B.Bmiddle(NotDISPLAY, BootsSearch, sort1, sort2, sort3, sort4, sort5, sort6);
		B.BLeftbar(FromPrice, ToPrice);
		capture(driver, 8);
		B.Bfooter(BootsURL);
		capture(driver, 9);
		
		test.log(LogStatus.PASS, "Boots PASS");
		test.log(LogStatus.FAIL, "Boots FAIL");
		
	}
	
	@Test(priority = 12)
	public void duffleBAGSandSTROLLEYS() throws InterruptedException, IOException {
		
		DBS.DBSheader(Language);
		capture(driver, 10);
		//DBS.DBSmiddle(NotDISPLAY, DuffleBagAndStrolleysSearch, sort1, sort2, sort3, sort4, sort5, sort6);
		DBS.DBSLeftbar(FromPrice, ToPrice);
		capture(driver, 11);
		DBS.DBSfooter(DuffleBagAndStrolleysURL);
		capture(driver, 12);
		
		test.log(LogStatus.PASS, "Duffle bag and STROLLEYS PASS");
		test.log(LogStatus.FAIL, "Duffle bag and STROLLEYS FAIL");
		
	}
	
	@Test(priority = 1)
	public void footwareCOMBOS() throws InterruptedException, IOException {
		
		FC.FCheader(Language);
		capture(driver, 13);
		//FC.FCmiddle(BuyDISPLAY, FootwearCombosSearch, NotDISPLAY, sort1, sort2, sort3, sort4, sort5, sort6);
		FC.FCLeftbar();
		capture(driver, 14);
		FC.FCfooter(FootwearCombosURL);
		capture(driver, 15);
		
		test.log(LogStatus.PASS, "Footware Combos PASS");
		test.log(LogStatus.FAIL, "Footware Combos FAIL");
		
	}
	
	@Test(priority = 4)
	public void formalSHOES() throws InterruptedException, IOException {
		
		FS.FSheader(Language);
		capture(driver, 16);
		//FS.FSmiddle(NotDISPLAY);
		FS.FSLeftbar(FromPrice, ToPrice);
		capture(driver, 17);
		FS.FSfooter(FormalShoesURL);
		capture(driver, 18);
		
		test.log(LogStatus.PASS, "Formal Shoes PASS");
		test.log(LogStatus.FAIL, "Formal Shoes FAIL");
		
	}
	
	@Test(priority = 9)
	public void handBAGSandCLUTCHES() throws InterruptedException, IOException {
		
		HC.HCheader(Language);
		capture(driver, 19);
		//HC.HCmiddle(NotDISPLAY);
		HC.HCLeftbar(FromPrice, ToPrice);
		capture(driver, 20);
		HC.HCfooter(HandbagAndClutchesURL);
		capture(driver, 21);
		
		test.log(LogStatus.PASS, "Hand Bags and Clutches PASS");
		test.log(LogStatus.FAIL, "Hand Bags and Clutches FAIL");
		
	}
	
	@Test(priority = 5)
	public void sandelANDslippers() throws InterruptedException, IOException {
		
		SAS.SASheader(Language);
		capture(driver, 22);
		//SAS.SASmiddle(NotDISPLAY);
		SAS.SASLeftbar(FromPrice, ToPrice);
		capture(driver, 23);
		SAS.SASfooter(SandalsAndSlippersURL);
		capture(driver, 24);
		
		test.log(LogStatus.PASS, "Sandel and Slippers PASS");
		test.log(LogStatus.FAIL, "Sandel and Slippers FAIL");
		
	}
	
	@Test(priority = 3)
	public void sportsSHOES() throws InterruptedException, IOException {
		
		SS.SSheader(Language);
		capture(driver, 25);
		//SS.SSmiddle(SportsShoesSearch, NotDISPLAY, BuyDISPLAY, sort1, sort2, sort3, sort4, sort5, sort6);
		SS.SSLeftbar(FromPrice, ToPrice);
		capture(driver, 26);
		SS.SSfooter(SportsShoesURL);
		capture(driver, 27);
		
		test.log(LogStatus.PASS, "Sports Shoes PASS");
		test.log(LogStatus.FAIL, "Sports Shoes FAIL");
		
	}
	
	@Test(priority = 10)
	public void TravelANDutilBAGS() throws InterruptedException, IOException {
		
		TUB.TUBheader(Language);
		capture(driver, 28);
		TUB.TUBLeftbar();
		capture(driver, 29);
		//TUB.TUBmiddle(TravelAndUtilityBagsURL, BuyDISPLAY);
		TUB.TUBfooter(TravelAndUtilityBagsURL);
		capture(driver, 30);
		
		test.log(LogStatus.PASS, "Travel and Utilities bags PASS");
		test.log(LogStatus.FAIL, "Travel and Utilities bags FAIL");
		
	}
	
	@Test(priority = 6)
	public void womensFOOTWARE() throws InterruptedException, IOException {
		
		WF.WFheader(Language);
		capture(driver, 31);
		WF.WFLeftbar(WomensFootwearURL);
		capture(driver, 32);
		//WF.WFmiddle(WomensFootwearURL, NotDISPLAY);
		WF.WFfooter(WomensFootwearURL);
		capture(driver, 33);
		
		test.log(LogStatus.PASS, "Womens Footware PASS");
		test.log(LogStatus.FAIL, "Womens Footware FAIL");
		
	}
	
	@Test(priority = 8)
	public void womensFATIONbags() throws InterruptedException, IOException {
		
		WFB.WFBheader(Language);
		capture(driver, 34);
		WFB.WFBLeftbar();
		capture(driver, 35);
		//WFB.WFBmiddle(NotDISPLAY, WomenFashionBagsURL);
		WFB.WFBfooter(WomenFashionBagsURL);
		capture(driver, 36);
		
		test.log(LogStatus.PASS, "Womens Fashion Bags PASS");
		test.log(LogStatus.FAIL, "Womens Fashion Bags FAIL");
		
	}
	
	@Test(priority = 7)
	public void womensSANDELS() throws InterruptedException, IOException {
		
		WS.WSheader(Language);
		capture(driver, 37);
		//WS.WSmiddle(BuyDISPLAY, NotDISPLAY, BRANDWomensSandalsSearch, sort1, sort2, sort3, sort4, sort5, sort6);
		WS.WSLeftbar(ToPrice, FromPrice);
		capture(driver, 38);
		WS.WSfooter(WomensSandalsURL);
		capture(driver, 39);
		capture(driver, 40);
		
		test.log(LogStatus.PASS, "Womens Scandel PASS");
		test.log(LogStatus.FAIL, "Womens Scandel FAIL");
		
	}
	
}
