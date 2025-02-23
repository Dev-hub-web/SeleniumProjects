
# Use Selenium standalone Chrome as the base image
FROM selenium/standalone-chrome:latest

# Set the working directory to the project root
WORKDIR /Users/hamza/IdeaProjects/AdvancedSeleniumProject

# Copy everything inside the project into the container
COPY . /src/test/java/ExcelTests/BaseTest.java

# Set default command (optional: keeps container running)
CMD ["tail", "-f", "/dev/null"]