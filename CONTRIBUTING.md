<h1><img src="https://user-images.githubusercontent.com/20110319/96505298-36c06d00-1256-11eb-99ff-cc239b3625eb.png" width=40px style="float:left;">Contributing</h1>
First of all, thanks for taking the time to contribute! Here are some ways you can help this project grow:

### Reporting issues
Found a bug? Something doesn't quite work? Post it on [Issues](../../issues "Issues")!

Issues make fixing bugs a lot easier by identifying errors devs didn't notice during testing. Just **make sure to check there isn't any report about it already**, then **follow the template** before posting it.

### Documentation
You found a typo? Is there something poorly documented? Fix it with a [Pull request](../../pulls "Pull requests")!

An issue post is not needed before adding a documentation pull request but, before writing and posting your sacred texts, make sure there isn't any pull request already covering what you're trying to document.

### Bugfixing
Do you know the solution to some issue and wanna fix it? Great!

> ⚠ **Remember to post the issue before getting hands on the code if there's no report yet about it!** ⚠

Now that your issue is properly reported you can move on to the [Updating code](#updating-code) section of this guide.

### Features
Got some ideas? Share them by posting on [Issues](../../issues "Issues")!

- **If you want to see some feature added in the future** post about it on [Issues](../../issues "Issues") using the feature template so we can check it out.
Keep in mind not every feature will be added, first they have to be **approved** before being ready to develop!.

> ⚠ **Remember to post the feature before getting hands on the code if there's no report yet about it!** ⚠

- **If you think you can help the project by implementing some feature** look for the **approved** flair on the issue post before starting and let us know you're on it by **commenting** on it so others know there's someone working of it.

- _**"I want to help implement some feature but it's already assigned to someone who hasn't uploaded the feature in a long time."**_ If someone has been already assigned but the issue looks abandoned comment on it so a moderator can assign you.

Now that the feature is posted and **approved**, [let's start coding!](#updating-code)

### Updating code
In order to keep the repository clean please keep in mind the following before making any changes:
- **Avoid implementing multiple things on a single pull request**. Adding implementations one by one helps in case some version needs some fixing and keeps the repository organized.
- **Use proper naming conventions and identations**. When everyone uses the same conventions the code remains clean and uniform.
- **In English, please**. This project's main language is English, please use it when adding code, posting issues or pull requests and try to avoid spelling mistakes.
- **Document EVERYTHING**. Always remember to add proper Javadoc to your methods so it's easier for others to use your code.
- **TEST TEST AND DOUBLE CHECK**. Make sure you run and test your code properly before posting a pull request ensuring every bit of code added works as intended.
- **Don't modify pom.xml or any basic plugin information**. Adding commands and permissions on `plugin.yml` is fine as long as it's well documented and follows the structure of the rest, but you shouldn't modify plugin's information like it's name or version.
- **Spaghetti's better as a plate**. Avoid spaghetti or bad code, remember this is an open repository, code should be clear and modularized for future manteinance.

#### Importing repository
1. Clone the repository using `git clone https://github.com/Thromax/BasicCommands/`
2. Install Java 1.8.0 JDK or OpenSDK equivalent. This is REALLY important, it will NOT work with any other version!.
3. Import the project on your favorite IDE as a Maven Project.

Also, if you already know how to do it in an IDE not listed below. Please [document it!](#documentation)
- **Eclipse**
	1. Launch eclipse and go to `File > Import project > Maven > Existing Maven Projects` and choose the folder that contains the cloned repository's folder using `Browse` button. Then click `Finish`.
	2. Right-click on the imported project and choose `Build Path > Configure Build Path` and make sure that `JRE System Library` points to your installed Java 1.8.0 JDK.
		- You can change the selected JDK by clicking `Edit` while selecting `JRE System Library`.
		- Make sure you check `Alternate JRE` and select your installed JDK, if the JDK is missing you can add it on `Installed JREs...`.
	3. You can close the properties window for now.

#### Building plugin
Now that the repository is imported you can check everythings fine by building the plugin before coding anything.
Different IDEs will have diffent procedures but you can search in Google how to build a Maven project with your preferred IDE.

Also, if you already know how to do it in an IDE not listed below. Please [document it!](#documentation)

- Eclipse
	- Right-click the imported project and choose `Run > Maven Build`.
	- If the build process starts without issues: Congratulations! You're done setting up!.
	- If some configuration window popped up type `clean package` in `Goals` and hit `Apply` before running. You will no longer need to repeat this step to build the plugin.