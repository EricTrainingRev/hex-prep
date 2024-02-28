## Testing Lifecycle
The testing lifecycle is very similar to the SDLC; you can think of the STLC as a subset of the SDLC.
1. Requirement Analysis
    - what user stories need testing?
2. Create Test Plan
    - What is the workflow for writing tests?
    - how will the testing team be organized?
    - how will our results be stored?
    - what technologies will we use for our testing?
3. Design test cases
    - what are our unit tests?
    - what are our integration tests?
    - what are our End to End tests?
    - what are our positive tests?
    - what are our negative tests?
4. Set up test environment
    - create test server
    - create database with dummy data
    - create mock API endpoints
5. Run tests
    - generate test report
    - report new bugs

## Standard Development Lifecycle overview
The SDLC is the workflow for creating a piece of software. There is no "official" or perfect SDLC, and different organizations will have their own take on the SDLC. All of them will have a similar structure as outlined below, or at least include them somewhere in their development lifecycle:
1. Determine Software Requirements
    - this is the first step of developing a piece of software: you need to know/decide what it needs to do
        - does it need to be fast above all else? Easy to use above all else? Look good, even if it does not work? etc.
    - User stories are developed at this time
2. Design the software
    - interfaces are created at this point
    - determine front end technology (angular? plain html/css/js?)
    - determine back end technology (server language? endpoints? entities? services?)
3. develop/test
    - create tests and write code to pass tests
4. deploy
    - software packaging happens at this point
        - web app deployed to AWS, executable jar file created, etc.
5. monitor/perform maintenance 
    - keep track of the application while it is use
        - monitor traffic, review logs, keep track of client comments, investigate bugs, etc

## Defect lifecycle
1. A bug is reported (could be from a test, user reported, etc)
2. the bug is assigned to a person or team
3. The bug is analyzed and/or recreated
    - the bug will either be rejected or deemed worth addressing
    - it could be rejected because the bug could not be reproduced, it is deemed a feature instead of a bug, an upcoming updated will fix the problem, etc
    - in this case, the bug status will be closed/finished, and you move on
4. assuming the bug needs to be addressed/fixed, you work on the code and test it thoroughly
    - if you/ your team can not fix the bug you report it and the bug is reassigned
5. Once the bug is fixed you close the bug status and move on