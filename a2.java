import java.util.*;
public class a2
{
	public static void instructor_menu()
	{
		System.out.print("INSTRUCTOR MENU");
		System.out.print("1. Add class material");
		System.out.print("2. Add assessments");
		System.out.print("3. View lecture materials");
		System.out.print("4. View assessments");
		System.out.print("5. Grade assessments");
		System.out.print("6. Close assessments");
		System.out.print("7. View assessments");
		System.out.print("8. Add comments");
		System.out.print("9. Logout");
	}

	public static void student_menu()
	{
		System.out.print("STUDENT MENU");
		System.out.print("1. View lecture materials");
		System.out.print("2. View assessments");
		System.out.print("3. Submit assessments");
		System.out.print("4. View grades");
		System.out.print("5. View comments");
		System.out.print("6. Add comments");
		System.out.print("7. Logout");

	}

	public static void backpack()
	{
		System.out.println("Welcome to BackPack");
		System.out.println("1. Enter as instructor");
		System.out.println("2. Enter as student");
		System.out.println("3. Exit");
	}

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		backpack();
		System.out.print("Enter your choice: ");
		int inp = scn.nextInt();
		if( inp == 1 )
		{
			System.out.println("Instructors:");
			System.out.print("0 - i0");
			System.out.print("1 - i1");
			System.out.print("Choose id: ");
			int i = scn.nextInt();
			if( i == 0 )
			{
				while(true)
				{
				System.out.println("Welcome i0");
				instructor_menu();
				int in = scn.nextInt();
				while(in >= 0 && in <= 9)
					{
						switch(in)
						{
							imp obj = new imp();
							case 1:
								System.out.println("1. Add Lecture Slide");
								System.out.println("2. Add Lecture Video");

								int map = scn.nextInt();

								if(map == 1) {
									System.out.print("Enter topic of slides: ");
									String slides = scn.nextLine();
									System.out.print("Enter number of slides: ");
									int slides_no = scn.nextInt();
									obj.add_class_material(slides, slides_no);
								}
								else if(map == 2) {
									System.out.print("Enter topic of video: ");
									String video_topic = input.nextLine();
									System.out.println("Enter filename of video: ");
									String video_name = input.nextLine();
									obj.add_class_material(video_topic, video_name);
								}
								break;

							case 2:
								System.out.println("1. Add Assignment");
								System.out.println("2. Add Quiz");

								int map1 = scn.nextInt();

								if(map1 == 1) {
									obj.addassessments1();
								}else if(map1 == 2) {
									obj.addassessments2();
								}
								break;
						}
					}
				}
			}

			else if( i == 1 )
			{
				System.out.println("Welcome i1");
			}

		}

		else if( inp == 2 )
		{
			
		}

		else
		{
			System.exit(0);
		}
	}
}

interface instructor
{
	void add_class_material();
	void add_assessments();
	void view_lecture_materials();
	void view_assessments();
	void grade_assessments();
	void close_assessments();
	void view_comments();
	void add_comments();
	void logout();
}

interface student
{
	void view_lecture_materials();
	void submit_assessments();
	void view_grades();
}

class imp implements instructor,student
{
	Scanner scn = new Scanner(System.in);
	public void add_class_material(String slides, int slides_no)
	{
		String slides, content;
		int slides_no;

		System.out.println("Enter content of slides");

		for (int x = 1; x <= slides_no; x++) {
			System.out.print("Content of slide " + x + ": ");
			content = scn.next();
		}
	}

	public void add_class_material(String video_topic, String video_name)
	{
		String video_topic, video_name;

		if(video_name.contains(".mp4")) {

		}
		else{
			System.out.println("Not Accepted");
		}
	}
}



