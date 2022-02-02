#Advanced configuration
org.jobrunr.database.skip_create=false
org.jobrunr.database.table_prefix= # allows to set a table prefix (e.g. schema for all tables)
org.jobrunr.database.datasource= # allows to specify a DataSource specifically for JobRunr
org.jobrunr.job-scheduler.enabled=true
org.jobrunr.background-job-server.enabled=false
org.jobrunr.background-job-server.worker_count= #this value normally is defined by the amount of CPU's that are available
org.jobrunr.background-job-server.poll_interval=15 #check for new work every 15 seconds
org.jobrunr.background-job-server.delete_succeeded_jobs_after=36 #succeeded jobs will go to the deleted state after 36 hours
org.jobrunr.background-job-server.permanently_delete_deleted_jobs_after=72 #deleted jobs will be deleted permanently after 72 hours
org.jobrunr.dashboard.enabled=false
org.jobrunr.dashboard.port=8000 #the port on which to start the dashboard