
Steps:

Create a New Jenkins Job

On the Jenkins dashboard, click "New Item".

Enter a name for your job (e.g., my-java-project-build).

Select "Freestyle project" or "Pipeline" (if you want to use declarative pipeline) and then click "OK".

Configure the Source Code Management (SCM)

In the job configuration, scroll to the "Source Code Management" section.

Select the type of SCM your project uses (e.g., "Git").

Enter the repository URL.

Provide any necessary authentication credentials (username, password, SSH keys, etc.).

Specify the branch to build (e.g., main or develop).

Configure the Build Environment (Optional)

In the "Build Environment" section you can add settings like:

"Use secret text(s) or file(s)": useful for handling credentials or other secrets.

Configure the Build Step

In the "Build" section, click the "Add build step" button.

Select the appropriate build step for your project:

For Maven projects: Choose "Invoke top-level Maven targets."

Enter the desired Maven goals, for example, clean install, if you are using the maven build tool for your project.

For Gradle projects: Choose "Invoke Gradle script".
Enter the tasks, for example, clean build, if you are using the gradle build tool.

For other build systems or if you are directly using the java executable: Choose "Execute shell" (Linux/macOS) or "Execute Windows batch command".

Here you can specify commands to compile, package, and run your Java application. For example:

javac YourClass.java # compilation
java YourClass # execution
content_copy
download
Use code with caution.
Bash

(Adjust according to your project structure)

Configure Post-Build Actions (Optional)

In the "Post-build Actions" section, you can add actions to perform after the build, such as:

Sending email notifications.

Archiving build artifacts (e.g., JAR files, logs).

Deploying the application.

Save the Job Configuration

Click "Save" to save your job configuration.

Running the Job:

Manual Run: Go to your job's page on Jenkins.

Click the "Build Now" button to manually trigger a build.

Scheduled Builds: In your job configuration, you can set up triggers to run the job automatically based on time intervals or changes in your SCM.

Example Scenarios

Maven Project:

SCM: Git, provide your repository details.

Build Step: "Invoke top-level Maven targets", goals = clean install.

Basic Java Class (no build system):

SCM: Git, provide your repository details.

Build Step: "Execute shell", commands = javac Main.java, java Main.

Important Considerations:

Dependencies: Ensure that all necessary libraries and dependencies are available during the build process, either bundled with your project or resolved by the build tools.

Environmental Variables: If your Java program requires environment variables, set them up in Jenkins (either on a project level or using the environment variable plugin).

Error Handling: Review Jenkins build console output to diagnose any errors or issues.

Build Agents: Consider using build agents to distribute the workload.

This should give you a solid foundation to build and run a Java program in Jenkins. Feel free to ask if you have more specific scenarios or questions.