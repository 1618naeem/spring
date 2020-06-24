package my_pack.SpringAnnotation;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class MediaTek implements MobileProcessor {

	public void process() {
		System.out.println("This Not Good Processor");
	}

}
