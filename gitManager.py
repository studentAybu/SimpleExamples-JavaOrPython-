import os
import subprocess

def git_Add1_system():
    os.system('git add gitManager.py && git commit -m "comment" && git push origin main')



def git_Add2_subprocess():
    subprocess.run(['git', 'add', 'gitManager.py'])
    subprocess.run(['git', 'commit', '-m', '"comment"'])
    subprocess.run(['git', 'push', 'origin', 'main'])

def git_Add3():
    subprocess.run(['git', 'add', 'button.html'])
    subprocess.run(['git', 'commit', '-m', '"comment"'])
    subprocess.run(['git', 'push', 'origin', 'main'])

git_Add1_system()
# #_Add2_subprocess()
#git_Add3()
