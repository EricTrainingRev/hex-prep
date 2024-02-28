## Pyramid Testing
There are three general levels of testing you can classify your tests into: unit, integration, and end to end. You can view it like a pyramid, with Unit tests supporting integration, and integration supporting e2e. What this means is that the majority of your tests should be unit tests. Every piece of functionality should have a unit test if possible, and these unit tests should test the intended, unintended, and edge cases. Integrated tests are the next level of the pyramid, which should still be extensive, but by its nature it will not have as many tests as the Unit tests. Finally, End to end tests are at the top of the pyramid and are the least frequent. These can work once your unit tests and integration tests are complete, and you can focus on testing the front end.

## Testing Mindset
Having a testing mindset is something that you develop overtime. Writing a test to make sure the functinality is working as intended is easy: knowing EVERYTHING that could potentially go wrong and testing for it is far more difficult, and as you learn more about your application, systems you are using, and the peculiarities of the language you are writting with, you will find more comprehensive ways to write tests. This is not an arbitrary requirement companies give their testers: the more efficient your tests are, the greater scalability your app will have. The more comprehensive your tests are the easier it is to answer: "can we make our app do {thing}?" The more comprehensive your tests are the easier it is to immediately know what is and is not possible. There are a few basic testing concepts to keep in mind as you start your testing career:
1. Positive Tests
    - how does the function handle correct input?
2. Negative Tests
    - how does the function handle incorrect input?
        - right type wrong data
        - wrong type
3. Edge cases
    - how does the function handle weird cases or extreme values?
        - how does it handle 0?
        - how does it handle an empty string?
        - how does it handle a really large number/string?
        - how does it handle an sql statement passed as an argument?
4. Redundancy
    - are your tests actually telling you something new?
        - passing in strings that are 6, 7, 8, 9, and 10 characters long into a function that takes a max of 5 characters doesn't tell you anything new
        - testing for your function to throw a divide by zero error when you divide by zero is redundant

## Testing Types
There are more kinds of tests than just the unit/integration tests:

- Functional Testing
    - These are tests that make sure a function is working
    - it is very basic: given the right input, does this function do what I want it to do?
    - optimization is irrelevant to this test: you just need to know if the test works or not
- System testing
    - These are tests that check the entirety of an application
    - do the front end and back end work together as intended?
    - These are often run from the user experience: will I be logged in correctly if I enter my login credentials?
- UAT (User Acceptance Testing)
    - These are tests to determine the user-friendliness of your application
        - very subjective, must be done manually
        - is the app intuitive?
        - is it pleasant to look at?
        - is the app responsive?
        - how hard do I need to think to use the app?
        - can involve alpha and beta testing
            - Alpha testing is when developers do the UAT
            - Beta testing is when end users test the application
                - what is intuitive to the developer may not be to the end user
- Performance Testing
    - These tests help determine the efficiency of your application
        - These tests can check the time, memory, or processing efficiency of the application
- Load Testing
    - tests how well the application can handle multiple users
        - can test expected traffic, heavy traffic, light traffic, etc.
        - is common to load traffic until app breaks to find the limit of the app
- Stress Testing
    - tests the application in unusual scenarios
        - what if 100 people try and choose the same username at the same time?
        - what if 10,000 people login at the same time?
        - what if 500 people try to buy the same 5 items at once?
- Endurance testing
    - These are the same as load test, but over a longer period of time
        - these tests are for finding those errors that take a long time to discover
            - what happens if a log file gets too large?
            - is there a memory leak?
- Spike test
    - these tests help determine how well (or how poorly) your application can scale
        - most modern apps perform auto-scaling, so the number of server handling requests increase or decrease depending on the traffic