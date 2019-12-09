## Demonstrates issue with IntelliJ Test runner

### Steps to reproduce (Windows)

* Open project in IntelliJ
* Ensure previous run configurations are deleted
* Ensure gradle settings are correct
    * Build and run using: IntelliJ IDEA
    * Run tests using: IntelliJ IDEA
* Optinally build project (Ctrl+F9, previously required for test runner to work)
* Open app/src/jvmTest/kotlin/se/lovef/common/HelloKtTest.kt
* Run tests for class by either
    * Press button in the gutter next to `class HelloKtTest`
    * Right click class end select `Run 'HelloKtTest'...`

### Expected result:
Test is executed with IntelliJ IDEA test runner

### Actual:
Test is executed with Gradle
