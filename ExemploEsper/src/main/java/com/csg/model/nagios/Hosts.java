package com.csg.model.nagios;

import com.csg.util.LS_TablesBase;
import com.csg.util.LivestatusSeparator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
/**
 * ##commentClass
 *
 * @created ##dateCreate
 * @author Adenir Ribeiro Gomes - <a href="mailto:adenir.gomes@gmail.com">adenir.gomes@gmail.com</a>
 */

public class Hosts extends LS_TablesBase {
	private static final long serialVersionUID = -6911459280290420652L;
	@JsonProperty
	public int accept_passive_checks = 0;  //Whether passive host checks are accepted (0/1)
	@JsonProperty
	public int acknowledged = 0;  //Whether the current host problem has been acknowledged (0/1)
	@JsonProperty
	public int acknowledgement_type = 0;  //Type of acknowledgement (0: none, 1: normal, 2: stick)
	@JsonProperty
	public String action_url = null;  //An optional URL to custom actions or information about this host
	@JsonProperty
	public String action_url_expanded = null;  //The same as action_url, but with the most important macros expanded
	@JsonProperty
	public int active_checks_enabled = 0;  //Whether active checks are enabled for the host (0/1)
	@JsonProperty
	public String address = null;  //IP address
	@JsonProperty
	public String alias = null;  //An alias name for the host
	@JsonProperty
	public String check_command = null;  //Nagios command for active host check of this host
	@JsonProperty
	public String check_command_expanded = null;  //Nagios command for active host check of this host with the macros expanded
	@JsonProperty
	public int check_flapping_recovery_notification = 0;  //Whether to check to send a recovery notification when flapping stops (0/1)
	@JsonProperty
	public int check_freshness = 0;  //Whether freshness checks are activated (0/1)
	@JsonProperty
	public Float check_interval = null;  //Number of basic interval lengths between two scheduled checks of the host
	@JsonProperty
	public int check_options = 0;  //The current check option, forced, normal, freshness... (0-2)
	@JsonProperty
	public String check_period = null;  //Time period in which this host will be checked. If empty then the host will always be checked.
	@JsonProperty
	public int check_type = 0;  //Type of check (0: active, 1: passive)
	@JsonProperty
	public int checks_enabled = 0;  //Whether checks of the host are enabled (0/1)
	@JsonProperty
	public String childs = null;  //A list of all direct childs of the host
	@JsonProperty
	public String comments = null;  //A list of the ids of all comments of this host
	@JsonProperty
	public String comments_with_extra_info = null;  //A list of all comments of the host with id, author, comment, entry type and entry time
	@JsonProperty
	public String comments_with_info = null;  //A list of all comments of the host with id, author and comment
	@JsonProperty
	public String contact_groups = null;  //A list of all contact groups this host is in
	@JsonProperty
	public String contacts = null;  //A list of all contacts of this host, either direct or via a contact group
	@JsonProperty
	public int current_attempt = 0;  //Number of the current check attempts
	@JsonProperty
	public int current_notification_number = 0;  //Number of the current notification
	@JsonProperty
	public String custom_variable_names = null;  //A list of the names of all custom variables
	@JsonProperty
	public String custom_variable_values = null;  //A list of the values of the custom variables
	@JsonProperty
	public String custom_variables = null;  //A dictionary of the custom variables
	@JsonProperty
	public String display_name = null;  //Optional display name of the host - not used by Nagios' web interface
	@JsonProperty
	public String downtimes = null;  //A list of the ids of all scheduled downtimes of this host
	@JsonProperty
	public String downtimes_with_info = null;  //A list of the all scheduled downtimes of the host with id, author and comment
	@JsonProperty
	public String event_handler = null;  //Nagios command used as event handler
	@JsonProperty
	public int event_handler_enabled = 0;  //Whether event handling is enabled (0/1)
	@JsonProperty
	public Float execution_time = null;  //Time the host check needed for execution
	@JsonProperty
	public String filename = null;  //The value of the custom variable FILENAME
	@JsonProperty
	public Float first_notification_delay = null;  //Delay before the first notification
	@JsonProperty
	public int flap_detection_enabled = 0;  //Whether flap detection is enabled (0/1)
	@JsonProperty
	public String groups = null;  //A list of all host groups this host is in
	@JsonProperty
	public int hard_state = 0;  //The effective hard state of the host (eliminates a problem in hard_state)
	@JsonProperty
	public int has_been_checked = 0;  //Whether the host has already been checked (0/1)
	@JsonProperty
	public Float high_flap_threshold = null;  //High threshold of flap detection
	@JsonProperty
	public String icon_image = null;  //The name of an image file to be used in the web pages
	@JsonProperty
	public String icon_image_alt = null;  //Alternative text for the icon_image
	@JsonProperty
	public String icon_image_expanded = null;  //The same as icon_image, but with the most important macros expanded
	@JsonProperty
	public int in_check_period = 0;  //Whether this host is currently in its check period (0/1)
	@JsonProperty
	public int in_notification_period = 0;  //Whether this host is currently in its notification period (0/1)
	@JsonProperty
	public int in_service_period = 0;  //Whether this host is currently in its service period (0/1)
	@JsonProperty
	public int initial_state = 0;  //Initial host state
	@JsonProperty
	public int is_executing = 0;  //is there a host check currently running... (0/1)
	@JsonProperty
	public int is_flapping = 0;  //Whether the host state is flapping (0/1)
	@JsonProperty
	public Timestamp last_check = null;  //Time of the last check (Unix timestamp)
	@JsonProperty
	public int last_hard_state = 0;  //Last hard state
	@JsonProperty
	public Timestamp last_hard_state_change = null;  //Time of the last hard state change (Unix timestamp)
	@JsonProperty
	public Timestamp last_notification = null;  //Time of the last notification (Unix timestamp)
	@JsonProperty
	public int last_state = 0;  //State before last state change
	@JsonProperty
	public Timestamp last_state_change = null;  //Time of the last state change - soft or hard (Unix timestamp)
	@JsonProperty
	public Timestamp last_time_down = null;  //The last time the host was DOWN (Unix timestamp)
	@JsonProperty
	public Timestamp last_time_unreachable = null;  //The last time the host was UNREACHABLE (Unix timestamp)
	@JsonProperty
	public Timestamp last_time_up = null;  //The last time the host was UP (Unix timestamp)
	@JsonProperty
	public Float latency = null;  //Time difference between scheduled check time and actual check time
	@JsonProperty
	public String long_plugin_output = null;  //Complete output from check plugin
	@JsonProperty
	public Float low_flap_threshold = null;  //Low threshold of flap detection
	@JsonProperty
	public int max_check_attempts = 0;  //Max check attempts for active host checks
	@JsonProperty
	public int modified_attributes = 0;  //A bitmask specifying which attributes have been modified
	@JsonProperty
	public String modified_attributes_list = null;  //A list of all modified attributes
	@JsonProperty
	public String name = null;  //Host name
	@JsonProperty
	public Timestamp next_check = null;  //Scheduled time for the next check (Unix timestamp)
	@JsonProperty
	public Timestamp next_notification = null;  //Time of the next notification (Unix timestamp)
	@JsonProperty
	public int no_more_notifications = 0;  //Whether to stop sending notifications (0/1)
	@JsonProperty
	public String notes = null;  //Optional notes for this host
	@JsonProperty
	public String notes_expanded = null;  //The same as notes, but with the most important macros expanded
	@JsonProperty
	public String notes_url = null;  //An optional URL with further information about the host
	@JsonProperty
	public String notes_url_expanded = null;  //Same es notes_url, but with the most important macros expanded
	@JsonProperty
	public Float notification_interval = null;  //Interval of periodic notification or 0 if its off
	@JsonProperty
	public String notification_period = null;  //Time period in which problems of this host will be notified. If empty then notification will be always
	@JsonProperty
	public int notifications_enabled = 0;  //Whether notifications of the host are enabled (0/1)
	@JsonProperty
	public int num_services = 0;  //The total number of services of the host
	@JsonProperty
	public int num_services_crit = 0;  //The number of the host's services with the soft state CRIT
	@JsonProperty
	public int num_services_hard_crit = 0;  //The number of the host's services with the hard state CRIT
	@JsonProperty
	public int num_services_hard_ok = 0;  //The number of the host's services with the hard state OK
	@JsonProperty
	public int num_services_hard_unknown = 0;  //The number of the host's services with the hard state UNKNOWN
	@JsonProperty
	public int num_services_hard_warn = 0;  //The number of the host's services with the hard state WARN
	@JsonProperty
	public int num_services_ok = 0;  //The number of the host's services with the soft state OK
	@JsonProperty
	public int num_services_pending = 0;  //The number of the host's services which have not been checked yet (pending)
	@JsonProperty
	public int num_services_unknown = 0;  //The number of the host's services with the soft state UNKNOWN
	@JsonProperty
	public int num_services_warn = 0;  //The number of the host's services with the soft state WARN
	@JsonProperty
	public int obsess_over_host = 0;  //The current obsess_over_host setting... (0/1)
	@JsonProperty
	public String parents = null;  //A list of all direct parents of the host
	@JsonProperty
	public int pending_flex_downtime = 0;  //Whether a flex downtime is pending (0/1)
	@JsonProperty
	public Float percent_state_change = null;  //Percent state change
	@JsonProperty
	public String perf_data = null;  //Optional performance data of the last host check
	@JsonProperty
	public String plugin_output = null;  //Output of the last host check
	@JsonProperty
	public int pnpgraph_present = 0;  //Whether there is a PNP4Nagios graph present for this host (0/1)
	@JsonProperty
	public int process_performance_data = 0;  //Whether processing of performance data is enabled (0/1)
	@JsonProperty
	public Float retry_interval = null;  //Number of basic interval lengths between checks when retrying after a soft error
	@JsonProperty
	public int scheduled_downtime_depth = 0;  //The number of downtimes this host is currently in
	@JsonProperty
	public String service_period = null;  //The name of the service period of the host
	@JsonProperty
	public String services = null;  //A list of all services of the host
	@JsonProperty
	public String services_with_info = null;  //A list of all services including detailed information about each service
	@JsonProperty
	public String services_with_state = null;  //A list of all services of the host together with state and has_been_checked
	@JsonProperty
	public Float staleness = null;  //Staleness indicator for this host
	@JsonProperty
	public int state = 0;  //The current state of the host (0: up, 1: down, 2: unreachable)
	@JsonProperty
	public int state_type = 0;  //Type of the current state (0: soft, 1: hard)
	@JsonProperty
	public String statusmap_image = null;  //The name of in image file for the status map
	@JsonProperty
	public int total_services = 0;  //The total number of services of the host
	@JsonProperty
	public int worst_service_hard_state = 0;  //The worst hard state of all of the host's services (OK <= WARN <= UNKNOWN <= CRIT)
	@JsonProperty
	public int worst_service_state = 0;  //The worst soft state of all of the host's services (OK <= WARN <= UNKNOWN <= CRIT)
	@JsonProperty
	public Float x_3d = null;  //3D-Coordinates: X
	@JsonProperty
	public Float y_3d = null;  //3D-Coordinates: Y
	@JsonProperty
	public Float z_3d = null;  //3D-Coordinates: Z
		
	@JsonProperty
	public List<EventWithInfo> events = new ArrayList<>();

	@JsonProperty
	public List<Service> listOfservices = new ArrayList<>();

	@Override
	public  void createObjects(){
		for (String str_evt : services_with_info.split(LivestatusSeparator.SEP3()))
		{
			EventWithInfo evt = new EventWithInfo();
			String[] str_col_evt =  str_evt.split(LivestatusSeparator.SEP4());
			evt.display_name = str_col_evt[0]; 
			evt.state = getAsInt(str_col_evt[1]); 
			evt.has_been_checked = getAsInt(str_col_evt[2]); 
			evt.notes = str_col_evt[3]; 
			events.add(evt);
		}	
		
		services = null;  //A list of all services of the host
		services_with_info = null;  //A list of all services including detailed information about each service
		services_with_state = null;  //A list of all services of the host together with state and has_been_checked

	}
	
	public String toString(){
		return 
		"Accept_passive_checks = " + accept_passive_checks + "\n" +
		"Acknowledged = " + acknowledged + "\n" +
		"Acknowledgement_type = " + acknowledgement_type + "\n" +
		"Action_url = " + action_url + "\n" +
		"Action_url_expanded = " + action_url_expanded + "\n" +
		"Active_checks_enabled = " + active_checks_enabled + "\n" +
		"Address = " + address + "\n" +
		"Alias = " + alias + "\n" +
		"Check_command = " + check_command + "\n" +
		"Check_command_expanded = " + check_command_expanded + "\n" +
		"Check_flapping_recovery_notification = " + check_flapping_recovery_notification + "\n" +
		"Check_freshness = " + check_freshness + "\n" +
		"Check_interval = " + check_interval + "\n" +
		"Check_options = " + check_options + "\n" +
		"Check_period = " + check_period + "\n" +
		"Check_type = " + check_type + "\n" +
		"Checks_enabled = " + checks_enabled + "\n" +
		"Childs = " + childs + "\n" +
		"Comments = " + comments + "\n" +
		"Comments_with_extra_info = " + comments_with_extra_info + "\n" +
		"Comments_with_info = " + comments_with_info + "\n" +
		"Contact_groups = " + contact_groups + "\n" +
		"Contacts = " + contacts + "\n" +
		"Current_attempt = " + current_attempt + "\n" +
		"Current_notification_number = " + current_notification_number + "\n" +
		"Custom_variable_names = " + custom_variable_names + "\n" +
		"Custom_variable_values = " + custom_variable_values + "\n" +
		"Custom_variables = " + custom_variables + "\n" +
		"Display_name = " + display_name + "\n" +
		"Downtimes = " + downtimes + "\n" +
		"Downtimes_with_info = " + downtimes_with_info + "\n" +
		"Event_handler = " + event_handler + "\n" +
		"Event_handler_enabled = " + event_handler_enabled + "\n" +
		"Execution_time = " + execution_time + "\n" +
		"Filename = " + filename + "\n" +
		"First_notification_delay = " + first_notification_delay + "\n" +
		"Flap_detection_enabled = " + flap_detection_enabled + "\n" +
		"Groups = " + groups + "\n" +
		"Hard_state = " + hard_state + "\n" +
		"Has_been_checked = " + has_been_checked + "\n" +
		"High_flap_threshold = " + high_flap_threshold + "\n" +
		"Icon_image = " + icon_image + "\n" +
		"Icon_image_alt = " + icon_image_alt + "\n" +
		"Icon_image_expanded = " + icon_image_expanded + "\n" +
		"In_check_period = " + in_check_period + "\n" +
		"In_notification_period = " + in_notification_period + "\n" +
		"In_service_period = " + in_service_period + "\n" +
		"Initial_state = " + initial_state + "\n" +
		"Is_executing = " + is_executing + "\n" +
		"Is_flapping = " + is_flapping + "\n" +
		"Last_check = " + last_check + "\n" +
		"Last_hard_state = " + last_hard_state + "\n" +
		"Last_hard_state_change = " + last_hard_state_change + "\n" +
		"Last_notification = " + last_notification + "\n" +
		"Last_state = " + last_state + "\n" +
		"Last_state_change = " + last_state_change + "\n" +
		"Last_time_down = " + last_time_down + "\n" +
		"Last_time_unreachable = " + last_time_unreachable + "\n" +
		"Last_time_up = " + last_time_up + "\n" +
		"Latency = " + latency + "\n" +
		"Long_plugin_output = " + long_plugin_output + "\n" +
		"Low_flap_threshold = " + low_flap_threshold + "\n" +
		"Max_check_attempts = " + max_check_attempts + "\n" +
		"Modified_attributes = " + modified_attributes + "\n" +
		"Modified_attributes_list = " + modified_attributes_list + "\n" +
		"Name = " + name + "\n" +
		"Next_check = " + next_check + "\n" +
		"Next_notification = " + next_notification + "\n" +
		"No_more_notifications = " + no_more_notifications + "\n" +
		"Notes = " + notes + "\n" +
		"Notes_expanded = " + notes_expanded + "\n" +
		"Notes_url = " + notes_url + "\n" +
		"Notes_url_expanded = " + notes_url_expanded + "\n" +
		"Notification_interval = " + notification_interval + "\n" +
		"Notification_period = " + notification_period + "\n" +
		"Notifications_enabled = " + notifications_enabled + "\n" +
		"Num_services = " + num_services + "\n" +
		"Num_services_crit = " + num_services_crit + "\n" +
		"Num_services_hard_crit = " + num_services_hard_crit + "\n" +
		"Num_services_hard_ok = " + num_services_hard_ok + "\n" +
		"Num_services_hard_unknown = " + num_services_hard_unknown + "\n" +
		"Num_services_hard_warn = " + num_services_hard_warn + "\n" +
		"Num_services_ok = " + num_services_ok + "\n" +
		"Num_services_pending = " + num_services_pending + "\n" +
		"Num_services_unknown = " + num_services_unknown + "\n" +
		"Num_services_warn = " + num_services_warn + "\n" +
		"Obsess_over_host = " + obsess_over_host + "\n" +
		"Parents = " + parents + "\n" +
		"Pending_flex_downtime = " + pending_flex_downtime + "\n" +
		"Percent_state_change = " + percent_state_change + "\n" +
		"Perf_data = " + perf_data + "\n" +
		"Plugin_output = " + plugin_output + "\n" +
		"Pnpgraph_present = " + pnpgraph_present + "\n" +
		"Process_performance_data = " + process_performance_data + "\n" +
		"Retry_interval = " + retry_interval + "\n" +
		"Scheduled_downtime_depth = " + scheduled_downtime_depth + "\n" +
		"Service_period = " + service_period + "\n" +
		"Services = " + services + "\n" +
		"Services_with_info = " + services_with_info + "\n" +
		"Services_with_state = " + services_with_state + "\n" +
		"Staleness = " + staleness + "\n" +
		"State = " + state + "\n" +
		"State_type = " + state_type + "\n" +
		"Statusmap_image = " + statusmap_image + "\n" +
		"Total_services = " + total_services + "\n" +
		"Worst_service_hard_state = " + worst_service_hard_state + "\n" +
		"Worst_service_state = " + worst_service_state + "\n" +
		"X_3d = " + x_3d + "\n" +
		"Y_3d = " + y_3d + "\n" +
		"Z_3d = " + z_3d + "\n" +
"";

	}
}
