# Full Stack Architecture

## Somewhere to Store Data
- Database
    - Data Warehouse
    - Relational Database Service
    - Cold Storage
    - etc.

## Facilitation Software
- Backend
    - Web Server
    - Direct Access
    - Proxy Servers
    - Etc.
- Not just facilitating user interactions, but transforming data as appropriate as well
    - Data Access Layer
        - this is the code that interacts with your database directly
    - Service Layer
        - this is the code that enforces business logic 
        - data transformation happens here
    - API Layer
        - this is the code that handles converting user interaction into a form the Backend can make sense of
            - example: if building a web server the API layer is where HTTP requests are handled and response are returned

## Somewhere the User interacts with the Stack
- Frontend
    - Web page
    - phyiscal computer
    - etc.
- Typically web pages are used to facilitate the front end: the page has the inputs and buttons/triggers for users to interact with your service
    - example: a user enters a username and password to log in to your service. This data is passed from the Frontend to the Backend for validation, and a response is given to the user.