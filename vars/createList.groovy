def call(){

def gitDir = "$JENKINS_HOME/workspace/git"
def f_gitDir = new File(gitDir)

if(!f_gitDir.exists()){
    f_gitDir.mkdirs()
}


def list = []


File folder = new File(gitDir);
File[] listOfFiles = folder.listFiles();

for (int i = 0; i < listOfFiles.length; i++) 
    list.add(listOfFiles[i].getName())

//println "${list}"

/*def verif (list){
    if(list.contains(STAGE_NAME) == false)
        return true
}*/



}
