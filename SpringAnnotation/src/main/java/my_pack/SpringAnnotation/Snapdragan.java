package my_pack.SpringAnnotation;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
//@Primary
public class Snapdragan implements MobileProcessor {

	public void process() {
		// TODO Auto-generated method stub
		System.out.println("This is the best CPU");

	}

}
