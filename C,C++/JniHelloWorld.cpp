#include "jni_HelloWorld.h"
void showMsg(const char * msg);
/*
 * Class:     jni_HelloWorld
 * Method:    displayHelloWorld
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_jni_HelloWorld_displayHelloWorld
(JNIEnv * env, jobject obj){
	showMsg("Hesdallasdasdowoasdrlddsfsfsfewrwrfsdfsdf!\n");
	return;
}

void showMsg(const char * msg){
	printf(msg);

}