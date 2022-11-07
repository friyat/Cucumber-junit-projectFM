Feature:Hioscar.com care options web app testing


  @hioscar
  Scenario: user should be able to select options
  Given Go to "https://www.hioscar.com/care-options"
  When Click Search network
  And From Coverage year dropdown Select "2023"option
  And From Coverage access dropdown "Select Employer-provided" option
  And From Network partner dropdown Select "Oscar" option
 And From Coverage area dropdown Select "New Jersey"
  And Click Continue button
  Then Verify title contains “Oscar”