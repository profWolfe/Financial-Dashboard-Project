# Financial-Dashboard-Project

## Website: http://ec2-52-91-217-221.compute-1.amazonaws.com/

# AWS EC2 HTML website implemented with ApexCharts and Java to create a financial dashboard. Code maintained through Github and VisualStudio. Source links provided below for troubleshooting.  

# Steps:
1. Create HTML website
2. Add ApexCharts charts to HTML website
3. Code Java into charts adding arrays etc.
4. Create EC2 server
5. Connect to EC2 server and transfer files via WinSCP

# Sources:
# Turtoial on how to create a dashboard using ApexCharts, by FullStackMastery on youtube.
1. https://www.youtube.com/watch?v=zOx7uqolauo

# To accurately test the website I ran a local testing server to make sure everything ran smoothly before launching it on an EC2 instance.
2. https://developer.mozilla.org/en-US/docs/Learn/Common_questions/set_up_a_local_testing_server#running_a_simple_local_http_server

# Implementing the graph code with simple and easy by using ApexCharts
3. https://apexcharts.com/javascript-chart-demos/

# Utilized IFrames so that I could imbed the dashboard.html file into the index.html file to create a more seemless look for the website.
4. https://www.w3schools.com/html/html_iframe.asp

# Launched EC2 website following an AWS EC2 web services guide.
5. https://www.linkedin.com/pulse/host-static-website-aws-ec2-chandan-mishra/?trk=articles_directory

# Found classy and slim looking buttons on CSS Scan.
6. https://getcssscan.com/css-buttons-examples

# Turtorial on how to copy files to AWS EC2 instance, by Wyshield Wyshield on youtube.
7. https://www.youtube.com/watch?v=Mzj7_nJB40k

# Troubleshooted a permission issue with WinSCP file transfer to /var/wwww/html/ location by using the command sudo chmod 777 /var/www/html -R in the console window.
8. https://stackoverflow.com/questions/50378664/permission-denied-inside-var-www-html-when-creating-a-website-and-its-files-wi