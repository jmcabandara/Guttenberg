package org.sobotics.guttenberg.utils;

import java.util.regex.Pattern;

/**
 * Created by bhargav.h on 11-Sep-16.
 */
public class PrintUtils {

    public static String printDescription(){
        return " [ [Guttenberg](http://stackapps.com/q/7197/43403) ] ";
    }
    public static String printDescription(String reportLink) {
    	if (reportLink == null || reportLink.isEmpty())
    		return PrintUtils.printDescription();
    	else
    		return " [ [Guttenberg](http://stackapps.com/q/7197/43403) | [CopyPastor]("+reportLink+") ] ";
    }
    /**
     * The pattern used to find out, if one of Guttenberg's messages is a report
     * */
    public static String reportIdRegExPatternString() {
    	return "\\[ \\[Guttenberg\\].*\\[CopyPastor]\\(.*\\/posts\\/(?'reportId'\\d*)\\)";
    }
    /**
     * The pattern used to find out, if one of Guttenberg's messages is a report
     * */
    public static Pattern reportIdRegExPattern() {
    	return Pattern.compile(PrintUtils.reportIdRegExPatternString());
    }
    public static String printStackAppsPost(){
        return "[Guttenberg - A bot searching for plagiarism on Stack Overflow](http://stackapps.com/q/7197/43403)";
    }
    public static String printHelp(){
        return "I'm a bot, searching for plagiarism on Stack Overflow. "+wikiLink()+" Use commands to view a list of commands.";
    }
    private static String wikiLink(){
        return "The guide and the wiki for the project [are present here](https://github.com/SOBotics/Guttenberg/wiki).";
    }
    public static String printCommandHeader(){
        return "The list of commands are as follows: "+wikiLink();
    }

}
