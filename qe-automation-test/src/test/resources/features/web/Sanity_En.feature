Feature: [UI]- To Verify H&M Header Links in English

  @Web @All @C-HP @H&MRegression @Header1
  Scenario Outline:  To Verify the Header link functionality
      Given user launches the browser and navigates to "H&M_HOME" page
      Then User clicks on Accept All Cookies
      Then User hovers on "<SignIn>" link
     
      Examples: 
      
       |SignIn|
       |Sign in|
#      
#  @H&MRegression
# Scenario Outline:  To Verify that the user is able to create H&M Account
#       
#      Given user launches the browser and navigates to "H&M_HOME" page
#      Then User clicks on Accept All Cookies
#      Then User hovers on "<SignIn>" link
##      And User clicks on Become A Member Button
#      
#      Examples: 
#      
#       |SignIn|
#       |Sign in|