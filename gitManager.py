import os
import subprocess

def git_Add1_system():
    os.system('git add gitManager.py && git commit -m "comment" && git push origin main')



def git_Add2_subprocess():
    subprocess.run(['git', 'add', 'gitManager.py'])
    subprocess.run(['git', 'commit', '-m', '"comment"'])
    subprocess.run(['git', 'remote', 'add', 'origin', 'git push origin main'])

#git_Add1_system()
git_Add2_subprocess()

