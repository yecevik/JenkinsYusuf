package utils;

import org.json.JSONObject;

public class APIPayloadConstant {

    public static String createEmployeePayload(){
        String createEmployeePayload =
                "\n" +
                        "{\n" +
                        "  \"emp_firstname\": \"Yusuf\",\n" +
                        "  \"emp_lastname\": \"Cevik\",\n" +
                        "  \"emp_middle_name\": \"Engin\",\n" +
                        "  \"emp_gender\": \"M\",\n" +
                        "  \"emp_birthday\": \"1974-04-04\",\n" +
                        "  \"emp_status\": \"confirmed\",\n" +
                        "  \"emp_job_title\": \"QA manager\"\n" +
                        "}";
        return createEmployeePayload;
    }
    public static String createEmployeeJsonBody(){
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname", "sara");
        obj.put("emp_lastname", "bou");
        obj.put("emp_middle_name", "ms");
        obj.put("emp_gender", "F");
        obj.put("emp_birthday", "2011-01-12");
        obj.put("emp_status", "confirmed");
        obj.put("emp_job_title","QA Engineer");
        return obj.toString();
    }
    public static String createEmployeePayloadDynamic(String firstname, String lastname, String middlename,
                                                      String gender, String dob,
                                                      String empStatus, String jobTitle){
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname", firstname);
        obj.put("emp_lastname", lastname);
        obj.put("emp_middle_name", middlename);
        obj.put("emp_gender", gender);
        obj.put("emp_birthday", dob);
        obj.put("emp_status", empStatus);
        obj.put("emp_job_title",jobTitle);
        return obj.toString();
    }

    public static String adminPayload(){
        String adminPayload =
                "{\n" +
                        "  \"email\": \"batch14@test.com\",\n" +
                        "  \"password\": \"Test@123\"\n" +
                        "}";
        return adminPayload;
    }
    public static String updateEmployeePayload(){
        String updateEmployeePayload =
                "{\n" +
                        "  \"employee_id\": \"46879A\",\n" +
                        "  \"emp_firstname\": \"James\",\n" +
                        "  \"emp_lastname\": \"Bond\",\n" +
                        "  \"emp_middle_name\": \"007\",\n" +
                        "  \"emp_gender\": \"M\",\n" +
                        "  \"emp_birthday\": \"1955-01-14\",\n" +
                        "  \"emp_status\": \"classified\",\n" +
                        "  \"emp_job_title\": \"Secret Agent (Spy)\"\n" +
                        "}";
        return updateEmployeePayload;
    }
    public static String updateEmployeePayloadDynamic(String empId, String firstname, String lastname, String middlename,
                                                      String gender, String dob,
                                                      String empStatus, String jobTitle){
        JSONObject obj = new JSONObject();
        obj.put("employee_id",empId);
        obj.put("emp_firstname", firstname);
        obj.put("emp_lastname", lastname);
        obj.put("emp_middle_name", middlename);
        obj.put("emp_gender", gender);
        obj.put("emp_birthday", dob);
        obj.put("emp_status", empStatus);
        obj.put("emp_job_title",jobTitle);
        return obj.toString();
    }

}