import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\merlin\\Java\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        // View login information
        String userName= "standard_user";
        String userPass = "secret_sauce";

        // Find the username and password fields
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));

        // Enter the login credentials
        usernameInput.sendKeys(userName);
        passwordInput.sendKeys(userPass);

        // Click the login button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        // Add cases to check input field validations 

        // Sort the products in price low to high order
        WebElement sortDropdown = driver.findElement(By.className("product_sort_container"));
        sortDropdown.sendKeys("Price (low to high)");

        // Add all items to the cart
        WebElement addToCartButton = driver.findElement(By.className("btn_inventory"));
        addToCartButton.click();

        // Go to the Cart page
        WebElement cartLink = driver.findElement(By.className("shopping_cart_link"));
        cartLink.click();

        // Remove items that have a price <$15
        WebElement removeButton = driver.findElement(By.className("cart_button"));
        removeButton.click();

        // Click on the Checkout button
        WebElement checkoutButton = driver.findElement(By.id("checkout"));
        checkoutButton.click();

        // Enter the details on your information page
        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        WebElement lastNameInput = driver.findElement(By.id("last-name"));
        WebElement postalInput = driver.findElement(By.id("postal-code"));
        // ... enter other details as needed

        firstNameInput.sendKeys("Merlin");
        lastNameInput.sendKeys("Moncy");
        postalInput.sendKeys("546738");
        // ... enter other details as needed

        // Click on the Continue button
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        // Finish the checkout by clicking the Finish button
        WebElement finishButton = driver.findElement(By.id("finish"));
        finishButton.click();

        // Return to the home page
        WebElement homeLink = driver.findElement(By.className("inventory_list"));
        homeLink.click();

        // Perform logout
        WebElement menuButton = driver.findElement(By.id("react-burger-menu-btn"));
        menuButton.click();

        WebElement logoutLink = driver.findElement(By.id("logout_sidebar_link"));
        logoutLink.click();

        // Close the browser
        driver.quit();
    }
}