<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BMI Result</title>
<style>
 .container
 {
 border: 2px solid #000;
 padding: 20px;
 margin: 0 auto;
 max-width: 600px;
 background-color: lightblue;
 }
</style>
</head>
<body style="text-align: center; background-color: lightgrey;">
<div class="container">
 <h2 style="color:brown;">BMI Result</h2>
 <%
 double bmi = Double.parseDouble(request.getParameter("bmi"));
 String category = "";
 if (bmi < 18.5)
 category = "Underweight";
 else if (bmi < 25)
 category = "Normal weight";
 else if (bmi < 30)
 category = "Overweight";
 else
 category = "Obese";
 out.println("<span style=\"color: blue;\">Your BMI: </span><b>" + bmi + "</b><br>");
 out.println("<span style=\"color: blue;\">Category: </span><b>" + category + "</b><br>");
 out.println("<br>");
 out.println("<br>");
 switch (category) {
 case "Underweight":
 String msg1="<span style=\"color:red;\">Health Recommendation:</span> Focus on
increasing calorie intake through nutritious foods, including calorie-dense, nutrient-rich options.
Engage in regular strength training exercises to build muscle mass. Prioritize nutrient-dense foods and
consider consulting with a healthcare provider or registered dietitian for personalized guidance. ";
 out.println(msg1);
 break;
 case "Normal weight":
 String msg="<span style=\"color:red;\">Health Recommendation:</span> Maintaining
good health involves a balanced lifestyle. This includes regular exercise (150 minutes of moderateintensity aerobic activity or 75 minutes of vigorous-intensity aerobic activity per week, plus musclestrengthening activities), a balanced diet rich in fruits, vegetables, whole grains, and lean proteins,
staying hydrated, getting enough quality sleep (7-9 hours per night), managing stress through
relaxation techniques, and regular health check-ups. These practices support overall physical and
mental well-being.";
 out.println(msg);
 break;
 case "Overweight":
 String msg2="<span style=\"color:red;\">Health Recommendation:</span> Adopt healthy
eating habits emphasizing a balanced diet rich in fruits, vegetables, whole grains, and lean proteins.
Increase physical activity levels with regular aerobic and strength training exercises. Set realistic
goals and track progress to maintain motivation.";
 out.println(msg2);
 break;
 case "Obese":
 String msg3="<span style=\"color:red;\">Health Recommendation:</span> Implement
comprehensive lifestyle modifications, including a balanced diet, portion control, and regular physical
activity. Seek support from healthcare professionals for guidance and accountability. Address
underlying factors contributing to obesity, such as stress or hormonal imbalances, for long-term
success.";
 out.println(msg3);
 out.println("<img src='images/obesity.jpeg' alt='Obesity' style='width: 300px;'>");
 break;
 }
 %>
</div>
</body>
</html>
