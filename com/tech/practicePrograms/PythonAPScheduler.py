# Using APSceduler for scheduling python scheduler jobs
# Triggering a windows bat file

#!/usr/bin/python
import os
from apscheduler.scheduler import Scheduler

# Start the scheduler
sched = Scheduler()
sched.start()
print("hello")
def job_function():
    os.system('D:\SimpleBatchFile.bat')


# Schedule a backup to run once from Monday to Friday at 4:00 (pm)
sched.add_cron_job(job_function, day_of_week='mon-fri', hour=16, minute=0)
