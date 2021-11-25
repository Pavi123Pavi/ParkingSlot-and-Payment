package com.parkingslotallocation.errorhandler;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.parkingslotallocation.exception.DuplicateParkingFloorException;
import com.parkingslotallocation.exception.DuplicateParkingPremiseException;
import com.parkingslotallocation.exception.DuplicateUserException;
import com.parkingslotallocation.exception.DuplicateVehicleException;
import com.parkingslotallocation.exception.InvalidLoginCredintialException;
import com.parkingslotallocation.exception.NoSuchParkingFloorException;
import com.parkingslotallocation.exception.NoSuchParkingPremiseException;
import com.parkingslotallocation.exception.NoSuchParkingSlotException;
import com.parkingslotallocation.exception.NoSuchPaymentFoundException;
import com.parkingslotallocation.exception.NoSuchUserException;
import com.parkingslotallocation.exception.NoSuchVehicleException;
import com.parkingslotallocation.exception.NotificationException;
import com.parkingslotallocation.exception.ParkingSlotNotAvailableException;
import com.parkingslotallocation.exception.PaymentFailureException;


@ControllerAdvice
public class ParkingExceptionHandler {

	@ExceptionHandler(DuplicateParkingFloorException.class)
	public ResponseEntity<?> handleEmployeeDataError(DuplicateParkingFloorException e){
		
		Map<String,Object> error = new LinkedHashMap<>();
		
		error.put("error : ","parking Floor already exists");
		error.put("message : ", e.getMessage());
		error.put("timeStamp : ", LocalDate.now().toString());
		return new ResponseEntity<Object>(error,HttpStatus.BAD_REQUEST);		
		
	}
	
	@ExceptionHandler(DuplicateParkingPremiseException.class)
	public ResponseEntity<?> handleEmployeeDataError(DuplicateParkingPremiseException e){
		
		Map<String,Object> error = new LinkedHashMap<>();
		
		error.put("error : ","parking Premise already exists");
		error.put("message : ", e.getMessage());
		error.put("timeStamp : ", LocalDate.now().toString());
		return new ResponseEntity<Object>(error,HttpStatus.BAD_REQUEST);		
		
	}
	
	@ExceptionHandler(DuplicateUserException.class)
	public ResponseEntity<?> handleEmployeeDataError(DuplicateUserException e){
		
		Map<String,Object> error = new LinkedHashMap<>();
		
		error.put("error : ","User already exists");
		error.put("message : ", e.getMessage());
		error.put("timeStamp : ", LocalDate.now().toString());
		return new ResponseEntity<Object>(error,HttpStatus.BAD_REQUEST);		
		
	}
	
	@ExceptionHandler(DuplicateVehicleException.class)
	public ResponseEntity<?> handleEmployeeDataError(DuplicateVehicleException e){
		
		Map<String,Object> error = new LinkedHashMap<>();
		
		error.put("error : ","Vehicle already exists");
		error.put("message : ", e.getMessage());
		error.put("timeStamp : ", LocalDate.now().toString());
		return new ResponseEntity<Object>(error,HttpStatus.BAD_REQUEST);		
		
	}
	
	@ExceptionHandler(InvalidLoginCredintialException.class)
	public ResponseEntity<?> handleEmployeeDataError(InvalidLoginCredintialException e){
		
		Map<String,Object> error = new LinkedHashMap<>();
		
		error.put("error : ","Login credintials are invalid");
		error.put("message : ", e.getMessage());
		error.put("timeStamp : ", LocalDate.now().toString());
		return new ResponseEntity<Object>(error,HttpStatus.BAD_REQUEST);		
		
	}
	
	@ExceptionHandler(NoSuchParkingFloorException.class)
	public ResponseEntity<?> handleEmployeeDataError(NoSuchParkingFloorException e){
		
		Map<String,Object> error = new LinkedHashMap<>();
		
		error.put("error : ","Parking floor does not exist");
		error.put("message : ", e.getMessage());
		error.put("timeStamp : ", LocalDate.now().toString());
		return new ResponseEntity<Object>(error,HttpStatus.BAD_REQUEST);		
		
	}
	
	@ExceptionHandler(NoSuchParkingPremiseException.class)
	public ResponseEntity<?> handleEmployeeDataError(NoSuchParkingPremiseException e){
		
		Map<String,Object> error = new LinkedHashMap<>();
		
		error.put("error : ","Parking premise does not exist");
		error.put("message : ", e.getMessage());
		error.put("timeStamp : ", LocalDate.now().toString());
		return new ResponseEntity<Object>(error,HttpStatus.BAD_REQUEST);		
		
	}
	
	@ExceptionHandler(NoSuchParkingSlotException.class)
	public ResponseEntity<?> handleEmployeeDataError(NoSuchParkingSlotException e){
		
		Map<String,Object> error = new LinkedHashMap<>();
		
		error.put("error : ","Parking Slot does not exist");
		error.put("message : ", e.getMessage());
		error.put("timeStamp : ", LocalDate.now().toString());
		return new ResponseEntity<Object>(error,HttpStatus.BAD_REQUEST);		
		
	}
	
	@ExceptionHandler(NoSuchPaymentFoundException.class)
	public ResponseEntity<?> handleEmployeeDataError(NoSuchPaymentFoundException e){
		
		Map<String,Object> error = new LinkedHashMap<>();
		
		error.put("error : ","Payment not found");
		error.put("message : ", e.getMessage());
		error.put("timeStamp : ", LocalDate.now().toString());
		return new ResponseEntity<Object>(error,HttpStatus.BAD_REQUEST);		
		
	}
	
	@ExceptionHandler(NoSuchUserException.class)
	public ResponseEntity<?> handleEmployeeDataError(NoSuchUserException e){
		
		Map<String,Object> error = new LinkedHashMap<>();
		
		error.put("error : ","User Unavailable");
		error.put("message : ", e.getMessage());
		error.put("timeStamp : ", LocalDate.now().toString());
		return new ResponseEntity<Object>(error,HttpStatus.BAD_REQUEST);		
		
	}
	
	@ExceptionHandler(NoSuchVehicleException.class)
	public ResponseEntity<?> handleEmployeeDataError(NoSuchVehicleException e){
		
		Map<String,Object> error = new LinkedHashMap<>();
		
		error.put("error : ","Vehicle Unavailable");
		error.put("message : ", e.getMessage());
		error.put("timeStamp : ", LocalDate.now().toString());
		return new ResponseEntity<Object>(error,HttpStatus.BAD_REQUEST);		
		
	}
	
	@ExceptionHandler(NotificationException.class)
	public ResponseEntity<?> handleEmployeeDataError(NotificationException e){
		
		Map<String,Object> error = new LinkedHashMap<>();
		
		error.put("error : ","Notification Exception");
		error.put("message : ", e.getMessage());
		error.put("timeStamp : ", LocalDate.now().toString());
		return new ResponseEntity<Object>(error,HttpStatus.BAD_REQUEST);		
		
	}
	
	@ExceptionHandler(ParkingSlotNotAvailableException.class)
	public ResponseEntity<?> handleEmployeeDataError(ParkingSlotNotAvailableException e){
		
		Map<String,Object> error = new LinkedHashMap<>();
		
		error.put("error : ","Parking slot unavaiable");
		error.put("message : ", e.getMessage());
		error.put("timeStamp : ", LocalDate.now().toString());
		return new ResponseEntity<Object>(error,HttpStatus.BAD_REQUEST);		
		
	}
	
	@ExceptionHandler(PaymentFailureException.class)
	public ResponseEntity<?> handleEmployeeDataError(PaymentFailureException e){
		
		Map<String,Object> error = new LinkedHashMap<>();
		
		error.put("error : ","Payment failed");
		error.put("message : ", e.getMessage());
		error.put("timeStamp : ", LocalDate.now().toString());
		return new ResponseEntity<Object>(error,HttpStatus.BAD_REQUEST);		
		
	}
	
}
