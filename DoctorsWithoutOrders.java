import java.util.*;


public class DoctorsWithoutOrders{

  public static void main(String[] args) {
    test1();
  }

  /**
   * Given a list of doctors and a list of patients, determines whether all the patients can
   * be seen. If so, this function fills in the schedule parameter with a map from doctors
   * to the set of patients that doctor would see.
   *
   * @param doctors  The list of the doctors available to work.
   * @param patients The list of the patients that need to be seen.
   * @param schedule An outparameter that will be filled in with the schedule, should one exist.
   * @return Whether or not a schedule was found.
   */
  public static boolean canAllPatientsBeSeen(HashMap<String, Integer> doctors,
                            HashMap<String, Integer> patients,
                            HashMap<String, HashSet<String>> schedule) {

    //base case - the map of patients is empty, returns True
    if (patients.isEmpty()){
      return true;
    }

    //if the patient has more hours than doctors - eliminate doctor
    //else, subtract patient hours from doctor and update fake copy of DoctorsWithoutOrders
    //canSeeAll()
    //do want to edit the schedule parameter
    //embedded for loop?
    //need to update patient map and update doctors map
      //problem will be easier to NOT edit the original doctors map so you can backtrack
      //editing the copy of it
    //copying a map
    //HashMap<String, Integer> copy = new HashMap<>();
    //copy.putAll(oldMap); this does not change the old map
    //look through patients in a for loop, then call recursive inside
    //array is hours for the patients
    return false;
  }

  public static void testCustom() {
    // ~ Your code goes here! ~
  }

  // Provided test cases below.

  public static void test1() {
    System.out.println("Provided: Can't schedule if a patient requires more hours than any doctor has.");
    HashMap<String, HashSet<String>> schedule = new HashMap<>();

    HashMap<String, Integer> doctors = new HashMap<>() {{
        put("Dr. Zhivago", 8);
        put("Dr. Strange", 8);
        put("Dr. Horrible", 8);
    }};

    HashMap<String, Integer> patients = new HashMap<String, Integer>() {{
        put("You Poor Soul", 9);  // Needs more time than any one doctor can provide
    }};

    System.out.println(false == canAllPatientsBeSeen(doctors, patients, schedule));
    System.out.println();
  }

  public static void test2() {
    System.out.println("Provided Test: Can schedule if doctor has way more time than patient needs.");
    HashMap<String, HashSet<String>> schedule = new HashMap<>();

    HashMap<String, Integer> doctors = new HashMap<>() {{
      put("Dr. Wheelock", 12);
    }};

    HashMap<String, Integer> patients = new HashMap<String, Integer>() {{
      put("Lucky Person", 8);
    }};

    System.out.println(true == canAllPatientsBeSeen(doctors, patients, schedule));
    System.out.println();
  }

  public static void test3() {
    System.out.println("Provided Test: Can schedule if there's one doctor and one patient with the same hours.");
    HashMap<String, HashSet<String>> schedule = new HashMap<>();

    HashMap<String, Integer> doctors = new HashMap<>() {{
      put("Dr. Wheelock", 8);
    }};

    HashMap<String, Integer> patients = new HashMap<String, Integer>() {{
      put("Lucky Person", 8);
    }};

    System.out.println(true == canAllPatientsBeSeen(doctors, patients, schedule));
    System.out.println();
  }

  public static void test4() {
    System.out.println("Provided Test: Schedule for one doctor and one patient is correct.");
    HashMap<String, HashSet<String>> schedule = new HashMap<>();

    HashMap<String, Integer> doctors = new HashMap<>() {{
          put("Dr. Wheelock", 8);
    }};
    HashMap<String, Integer> patients = new HashMap<String, Integer>() {{
          put("Lucky Patient", 8);
    }};
    System.out.println(true == canAllPatientsBeSeen(doctors, patients, schedule));

    // Comment the code below back in to test your schedule parameter.
    // System.out.println("Schedule result: " + schedule);
    // HashMap<String, HashSet<String>> expectedSchedule = new HashMap<>();
    // expectedSchedule.put("Dr. Wheelock", new HashSet<>(Arrays.asList("Lucky Patient")));
    // System.out.println("Schedule matches expected: " + expectedSchedule.equals(schedule));
    System.out.println();
  }

  public static void test5() {
    System.out.println("Provided Test: Single doctor can see many patients.");
    HashMap<String, HashSet<String>> schedule = new HashMap<>();

    HashMap<String, Integer> doctors = new HashMap<>() {{
      put("Dr. House", 7);
    }};
    HashMap<String, Integer> patients = new HashMap<String, Integer>() {{
      put("Patient A", 4);
      put("Patient B", 2);
      put("Patient C", 1);
    }};
    System.out.println(true == canAllPatientsBeSeen(doctors, patients, schedule));

    // Comment the code below back in to test your schedule parameter.
    // System.out.println("Schedule result: " + schedule);
    // HashMap<String, HashSet<String>> expectedSchedule = new HashMap<>();
    // expectedSchedule.put("Dr. House", new HashSet<>(Arrays.asList("Patient A", "Patient B", "Patient C")));
    // System.out.println("Schedule matches expected: " + expectedSchedule.equals(schedule));
    System.out.println();
  }

  public static void test6() {
    System.out.println("Provided Test: Multiple doctors can see multiple patients.");

    HashMap<String, HashSet<String>> schedule = new HashMap<>();

    HashMap<String, Integer> doctors = new HashMap<>() {{
        put("Dr. House", 7 );
        put("AutoDoc",   70);
    }};
    HashMap<String, Integer> patients = new HashMap<String, Integer>() {{
        put("Patient A", 4 );
        put("Patient B", 2 );
        put("Patient C", 1 );
        put("Patient D", 40);
        put("Patient E", 20);
        put("Patient F", 10);
    }};
    System.out.println(true == canAllPatientsBeSeen(doctors, patients, schedule));

    // Comment the code below back in to test your schedule parameter.
    // System.out.println("Schedule result: " + schedule);
    // HashMap<String, HashSet<String>> expectedSchedule = new HashMap<>();
    // expectedSchedule.put("Dr. House", new HashSet<>(Arrays.asList("Patient A", "Patient B", "Patient C")));
    // expectedSchedule.put("AutoDoc", new HashSet<>(Arrays.asList("Patient D", "Patient E", "Patient F")));
    // System.out.println("Schedule matches expected: " + expectedSchedule.equals(schedule));
    System.out.println();
  }

  public static void test7() {
    System.out.println("Provided Test: Doesn't necessarily assign neediest patient to most available doctor.");

    HashMap<String, HashSet<String>> schedule = new HashMap<>();

    HashMap<String, Integer> doctors = new HashMap<>() {{
        put("Doctor Workaholic", 10);
        put("Doctor Average",    8);
        put("Doctor Lazy",       6);
    }};
    HashMap<String, Integer> patients = new HashMap<String, Integer>() {{
        put("Patient EightHour", 8);
        put("Patient SixHour",   6);
        put("Patient FiveHour1", 5);
        put("Patient FiveHour2", 5);
    }};
    System.out.println(true == canAllPatientsBeSeen(doctors, patients, schedule));
    System.out.println();
  }

  public static void test9() {
    System.out.println("Provided Test: Agreement in total hours doesn't mean a schedule exists (1).");
    HashMap<String, HashSet<String>> schedule = new HashMap<>();

    HashMap<String, Integer> doctors = new HashMap<>() {{
      put("Doctor A", 3);
      put("Doctor B", 3);
    }};
    HashMap<String, Integer> patients = new HashMap<String, Integer>() {{
      put("Patient X", 2);
      put("Patient Y", 2);
      put("Patient Z", 2);
    }};
    System.out.println(false == canAllPatientsBeSeen(doctors, patients, schedule));
    System.out.println();
  }

}
