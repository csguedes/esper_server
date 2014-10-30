package com.csg.model.nagios;

import com.csg.util.LS_TablesBase;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;
/**
 * ##commentClass
 *
 * @created ##dateCreate
 * @author Adenir Ribeiro Gomes - <a href="mailto:adenir.gomes@gmail.com">adenir.gomes@gmail.com</a>
 */
public class Service extends LS_TablesBase {
	private static final long serialVersionUID = -6911459280290420652L;
	@JsonProperty
	public int accept_passive_checks = 0;  //Whether the service accepts passive checks (0/1)
	@JsonProperty
	public int acknowledged = 0;  //Whether the current service problem has been acknowledged (0/1)
	@JsonProperty
	public int acknowledgement_type = 0;  //The type of the acknownledgement (0: none, 1: normal, 2: sticky)
	@JsonProperty
	public String action_url = null;  //An optional URL for actions or custom information about the service
	@JsonProperty
	public String action_url_expanded = null;  //The action_url with (the most important) macros expanded
	@JsonProperty
	public int active_checks_enabled = 0;  //Whether active checks are enabled for the service (0/1)
	@JsonProperty
	public String check_command = null;  //Nagios command used for active checks
	@JsonProperty
	public String check_command_expanded = null;  //Nagios command used for active checks with the macros expanded
	@JsonProperty
	public int check_freshness = 0;  //Whether freshness checks are activated (0/1)
	@JsonProperty
	public Float check_interval = null;  //Number of basic interval lengths between two scheduled checks of the service
	@JsonProperty
	public int check_options = 0;  //The current check option, forced, normal, freshness... (0/1)
	@JsonProperty
	public String check_period = null;  //The name of the check period of the service. It this is empty, the service is always checked.
	@JsonProperty
	public int check_type = 0;  //The type of the last check (0: active, 1: passive)
	@JsonProperty
	public int checks_enabled = 0;  //Whether active checks are enabled for the service (0/1)
	@JsonProperty
	public String comments = null;  //A list of all comment ids of the service
	@JsonProperty
	public String comments_with_extra_info = null;  //A list of all comments of the service with id, author, comment, entry type and entry time
	@JsonProperty
	public String comments_with_info = null;  //A list of all comments of the service with id, author and comment
	@JsonProperty
	public String contact_groups = null;  //A list of all contact groups this service is in
	@JsonProperty
	public String contacts = null;  //A list of all contacts of the service, either direct or via a contact group
	@JsonProperty
	public int current_attempt = 0;  //The number of the current check attempt
	@JsonProperty
	public int current_notification_number = 0;  //The number of the current notification
	@JsonProperty
	public String custom_variable_names = null;  //A list of the names of all custom variables of the service
	@JsonProperty
	public String custom_variable_values = null;  //A list of the values of all custom variable of the service
	@JsonProperty
	public String custom_variables = null;  //A dictionary of the custom variables
	@JsonProperty
	public String description = null;  //Description of the service (also used as key)
	@JsonProperty
	public String display_name = null;  //An optional display name (not used by Nagios standard web pages)
	@JsonProperty
	public String downtimes = null;  //A list of all downtime ids of the service
	@JsonProperty
	public String downtimes_with_info = null;  //A list of all downtimes of the service with id, author and comment
	@JsonProperty
	public String event_handler = null;  //Nagios command used as event handler
	@JsonProperty
	public int event_handler_enabled = 0;  //Whether and event handler is activated for the service (0/1)
	@JsonProperty
	public Float execution_time = null;  //Time the service check needed for execution
	@JsonProperty
	public Float first_notification_delay = null;  //Delay before the first notification
	@JsonProperty
	public int flap_detection_enabled = 0;  //Whether flap detection is enabled for the service (0/1)
	@JsonProperty
	public String groups = null;  //A list of all service groups the service is in
	@JsonProperty
	public int has_been_checked = 0;  //Whether the service already has been checked (0/1)
	@JsonProperty
	public Float high_flap_threshold = null;  //High threshold of flap detection
	@JsonProperty
	public String icon_image = null;  //The name of an image to be used as icon in the web interface
	@JsonProperty
	public String icon_image_alt = null;  //An alternative text for the icon_image for browsers not displaying icons
	@JsonProperty
	public String icon_image_expanded = null;  //The icon_image with (the most important) macros expanded
	@JsonProperty
	public int in_check_period = 0;  //Whether the service is currently in its check period (0/1)
	@JsonProperty
	public int in_notification_period = 0;  //Whether the service is currently in its notification period (0/1)
	@JsonProperty
	public int in_service_period = 0;  //Whether this service is currently in its service period (0/1)
	@JsonProperty
	public int initial_state = 0;  //The initial state of the service
	@JsonProperty
	public int is_executing = 0;  //is there a service check currently running... (0/1)
	@JsonProperty
	public int is_flapping = 0;  //Whether the service is flapping (0/1)
	@JsonProperty
	public Timestamp last_check = null;  //The time of the last check (Unix timestamp)
	@JsonProperty
	public int last_hard_state = 0;  //The last hard state of the service
	@JsonProperty
	public Timestamp last_hard_state_change = null;  //The time of the last hard state change (Unix timestamp)
	@JsonProperty
	public Timestamp last_notification = null;  //The time of the last notification (Unix timestamp)
	@JsonProperty
	public int last_state = 0;  //The last state of the service
	@JsonProperty
	public Timestamp last_state_change = null;  //The time of the last state change (Unix timestamp)
	@JsonProperty
	public Timestamp last_time_critical = null;  //The last time the service was CRITICAL (Unix timestamp)
	@JsonProperty
	public Timestamp last_time_ok = null;  //The last time the service was OK (Unix timestamp)
	@JsonProperty
	public Timestamp last_time_unknown = null;  //The last time the service was UNKNOWN (Unix timestamp)
	@JsonProperty
	public Timestamp last_time_warning = null;  //The last time the service was in WARNING state (Unix timestamp)
	@JsonProperty
	public Float latency = null;  //Time difference between scheduled check time and actual check time
	@JsonProperty
	public String long_plugin_output = null;  //Unabbreviated output of the last check plugin
	@JsonProperty
	public Float low_flap_threshold = null;  //Low threshold of flap detection
	@JsonProperty
	public int max_check_attempts = 0;  //The maximum number of check attempts
	@JsonProperty
	public int modified_attributes = 0;  //A bitmask specifying which attributes have been modified
	@JsonProperty
	public String modified_attributes_list = null;  //A list of all modified attributes
	@JsonProperty
	public Timestamp next_check = null;  //The scheduled time of the next check (Unix timestamp)
	@JsonProperty
	public Timestamp next_notification = null;  //The time of the next notification (Unix timestamp)
	@JsonProperty
	public int no_more_notifications = 0;  //Whether to stop sending notifications (0/1)
	@JsonProperty
	public String notes = null;  //Optional notes about the service
	@JsonProperty
	public String notes_expanded = null;  //The notes with (the most important) macros expanded
	@JsonProperty
	public String notes_url = null;  //An optional URL for additional notes about the service
	@JsonProperty
	public String notes_url_expanded = null;  //The notes_url with (the most important) macros expanded
	@JsonProperty
	public Float notification_interval = null;  //Interval of periodic notification or 0 if its off
	@JsonProperty
	public String notification_period = null;  //The name of the notification period of the service. It this is empty, service problems are always notified.
	@JsonProperty
	public int notifications_enabled = 0;  //Whether notifications are enabled for the service (0/1)
	@JsonProperty
	public int obsess_over_service = 0;  //Whether 'obsess_over_service' is enabled for the service (0/1)
	@JsonProperty
	public Float percent_state_change = null;  //Percent state change
	@JsonProperty
	public String perf_data = null;  //Performance data of the last check plugin
	@JsonProperty
	public String plugin_output = null;  //Output of the last check plugin
	@JsonProperty
	public int pnpgraph_present = 0;  //Whether there is a PNP4Nagios graph present for this service (0/1)
	@JsonProperty
	public int process_performance_data = 0;  //Whether processing of performance data is enabled for the service (0/1)
	@JsonProperty
	public Float retry_interval = null;  //Number of basic interval lengths between checks when retrying after a soft error
	@JsonProperty
	public int scheduled_downtime_depth = 0;  //The number of scheduled downtimes the service is currently in
	@JsonProperty
	public String service_period = null;  //The name of the service period of the service
	@JsonProperty
	public Float staleness = null;  //The staleness indicator for this service
	@JsonProperty
	public int state = 0;  //The current state of the service (0: OK, 1: WARN, 2: CRITICAL, 3: UNKNOWN)
	@JsonProperty
	public int state_type = 0;  //The type of the current state (0: soft, 1: hard)
	public String toString(){
		return 
		"Accept_passive_checks = " + accept_passive_checks + "\n" +
		"Acknowledged = " + acknowledged + "\n" +
		"Acknowledgement_type = " + acknowledgement_type + "\n" +
		"Action_url = " + action_url + "\n" +
		"Action_url_expanded = " + action_url_expanded + "\n" +
		"Active_checks_enabled = " + active_checks_enabled + "\n" +
		"Check_command = " + check_command + "\n" +
		"Check_command_expanded = " + check_command_expanded + "\n" +
		"Check_freshness = " + check_freshness + "\n" +
		"Check_interval = " + check_interval + "\n" +
		"Check_options = " + check_options + "\n" +
		"Check_period = " + check_period + "\n" +
		"Check_type = " + check_type + "\n" +
		"Checks_enabled = " + checks_enabled + "\n" +
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
		"Description = " + description + "\n" +
		"Display_name = " + display_name + "\n" +
		"Downtimes = " + downtimes + "\n" +
		"Downtimes_with_info = " + downtimes_with_info + "\n" +
		"Event_handler = " + event_handler + "\n" +
		"Event_handler_enabled = " + event_handler_enabled + "\n" +
		"Execution_time = " + execution_time + "\n" +
		"First_notification_delay = " + first_notification_delay + "\n" +
		"Flap_detection_enabled = " + flap_detection_enabled + "\n" +
		"Groups = " + groups + "\n" +
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
		"Last_time_critical = " + last_time_critical + "\n" +
		"Last_time_ok = " + last_time_ok + "\n" +
		"Last_time_unknown = " + last_time_unknown + "\n" +
		"Last_time_warning = " + last_time_warning + "\n" +
		"Latency = " + latency + "\n" +
		"Long_plugin_output = " + long_plugin_output + "\n" +
		"Low_flap_threshold = " + low_flap_threshold + "\n" +
		"Max_check_attempts = " + max_check_attempts + "\n" +
		"Modified_attributes = " + modified_attributes + "\n" +
		"Modified_attributes_list = " + modified_attributes_list + "\n" +
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
		"Obsess_over_service = " + obsess_over_service + "\n" +
		"Percent_state_change = " + percent_state_change + "\n" +
		"Perf_data = " + perf_data + "\n" +
		"Plugin_output = " + plugin_output + "\n" +
		"Pnpgraph_present = " + pnpgraph_present + "\n" +
		"Process_performance_data = " + process_performance_data + "\n" +
		"Retry_interval = " + retry_interval + "\n" +
		"Scheduled_downtime_depth = " + scheduled_downtime_depth + "\n" +
		"Service_period = " + service_period + "\n" +
		"Staleness = " + staleness + "\n" +
		"State = " + state + "\n" +
		"State_type = " + state_type + "\n" +
"";

	}
}
