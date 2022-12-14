package Wednesday_Review;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Review_Webdriver {
/*    //ArrayList for cars
    ArrayList<String> cars = new ArrayList<>();
    cars.add("BMW");
    cars.add("Audi");
    cars.add("Mercedes");


    //define the web driver manager setup for chromedriver
    WebDriverManager.chromedriver().setup();
    //define the chrome driver to use for your test
    //creating an instance for a chrome driver(browser) to use for automation
    WebDriver driver = new ChromeDriver();

    for (int i = 0; i < cars.size(); i++) {

        //navigate to the google site
        driver.navigate().to("https://www.google.com");

        //maximize my window
        //for Windows
        driver.manage().window().maximize();
        //for mac
        //driver.manage().window().fullscreen();

        //sleep statement
        Thread.sleep(3000);

        //search a keyword on the search field
        //relative xpath to locate the element
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys(cars.get(i));
        //hit submit on the Google search button
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();

        //sleep statement
        Thread.sleep(3000);

        //capture the search result text
        String result = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        //split message to extract out the search number
        String[] splitResult = result.split(" ");
        System.out.println("the search number for "+cars.get(i) + " is " + splitResult[1]);


        //quit the driver to end the session
    }
    driver.quit();



/*
//this is an example of relative xpath
        driver.findElement(By.xpath("//*[@name = 'q']")).sendKeys("cars");
    //this is an example of absolute xpath
        driver.findElement(By.xpath("//div[@class = 'RNNXgb']//div//div//input")).sendKeys("cars");


*/

}//end of java
