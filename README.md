Ethan Davids 
ST10436166


Splash Screen Pseudocode

class SplashActivity
    onCreate()
        set content view to activity_splash.xml
        find buttons (btn_main, btn_exit)

        on btn_main click
            navigate to MainActivity

        on btn_exit click
            exit app
Main Activity Pseudocode
class MainActivity
    variables:
        EditText array for 7 days (editDay1, editDay2, ..., editDay7)
        TextView avgTemperature
        int array temperatures of size 7
        String array days of size 7

    onCreate()
        set content view to activity_main.xml
        initialize EditTexts and TextView
        find buttons (btn_clear, btn_view_details, btn_exit)

        on btn_clear click
            clear all EditTexts
            reset avgTemperature TextView

        on btn_view_details click
            read user input from EditTexts into arrays (days, temperatures)
            calculate average temperature
            pass data to DetailedViewActivity
            navigate to DetailedViewActivity

        on btn_exit click
            exit app

    function clearData()
        clear text of all EditTexts
        reset avgTemperature TextView

    function calculateAverageTemperature()
        read input from EditTexts into days array
        extract temperature values from days array into temperatures array
        calculate average of temperatures array
        display average temperature in avgTemperature TextView

Detailed View Screen Pseudocode

class DetailedViewActivity
    variables:
        TextView array for day details (dayDetails)

    onCreate()
        set content view to activity_detailed_view.xml
        initialize TextViews

        get days array and temperatures array from intent extras

        if days and temperatures are not null
            populate TextViews with day details and temperatures

        find button (btn_back)

        on btn_back click
            finish activity to go back to MainActivity


            The Applications purpose is to provide average temperature for the week which also allows the users to view detailed information for each day


           Data Input: Users can input their weather forecasts data for each day of the week, including the date, minimum and maximum temperatures, and weather conditions.

Data Management: Users can clear their input data to reset and re-input new data. This helps in maintaining up-to-date records of their screen time usage.

Calculations: The app calculates the average screen time over the week using the input data, helping users understand their overall screen time usage.

Detailed View: Users can navigate to a detailed view screen to see the specific data for each day, including any additional relevant information like weather conditions.

Navigation and Usability: The app includes navigation buttons for smooth transitions between the screens and an intuitive user interface for ease of use

            

            


