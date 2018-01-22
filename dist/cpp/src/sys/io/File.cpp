#include <hxcpp.h>

#ifndef INCLUDED_cpp_Lib
#include <cpp/Lib.h>
#endif
#ifndef INCLUDED_haxe_io_Input
#include <haxe/io/Input.h>
#endif
#ifndef INCLUDED_sys_io_File
#include <sys/io/File.h>
#endif
#ifndef INCLUDED_sys_io_FileInput
#include <sys/io/FileInput.h>
#endif
namespace sys{
namespace io{

Void File_obj::__construct()
{
	return null();
}

//File_obj::~File_obj() { }

Dynamic File_obj::__CreateEmpty() { return  new File_obj; }
hx::ObjectPtr< File_obj > File_obj::__new()
{  hx::ObjectPtr< File_obj > _result_ = new File_obj();
	_result_->__construct();
	return _result_;}

Dynamic File_obj::__Create(hx::DynamicArray inArgs)
{  hx::ObjectPtr< File_obj > _result_ = new File_obj();
	_result_->__construct();
	return _result_;}

::sys::io::FileInput File_obj::read( ::String path,hx::Null< bool >  __o_binary){
bool binary = __o_binary.Default(true);
	HX_STACK_FRAME("sys.io.File","read",0x203d07e1,"sys.io.File.read","/usr/share/haxe/std/cpp/_std/sys/io/File.hx",49,0xa9f746ff)
	HX_STACK_ARG(path,"path")
	HX_STACK_ARG(binary,"binary")
{
		HX_STACK_LINE(50)
		::String tmp = path;		HX_STACK_VAR(tmp,"tmp");
		HX_STACK_LINE(50)
		bool tmp1 = binary;		HX_STACK_VAR(tmp1,"tmp1");
		HX_STACK_LINE(50)
		::String tmp2;		HX_STACK_VAR(tmp2,"tmp2");
		HX_STACK_LINE(50)
		if ((tmp1)){
			HX_STACK_LINE(50)
			tmp2 = HX_HCSTRING("rb","\xb0","\x63","\x00","\x00");
		}
		else{
			HX_STACK_LINE(50)
			tmp2 = HX_HCSTRING("r","\x72","\x00","\x00","\x00");
		}
		HX_STACK_LINE(50)
		Dynamic tmp3 = ::sys::io::File_obj::file_open(tmp,tmp2);		HX_STACK_VAR(tmp3,"tmp3");
		HX_STACK_LINE(50)
		::sys::io::FileInput tmp4 = ::sys::io::FileInput_obj::__new(tmp3);		HX_STACK_VAR(tmp4,"tmp4");
		HX_STACK_LINE(50)
		return tmp4;
	}
}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(File_obj,read,return )

Dynamic File_obj::file_open;


File_obj::File_obj()
{
}

bool File_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 4:
		if (HX_FIELD_EQ(inName,"read") ) { outValue = read_dyn(); return true;  }
		break;
	case 9:
		if (HX_FIELD_EQ(inName,"file_open") ) { outValue = file_open; return true;  }
	}
	return false;
}

bool File_obj::__SetStatic(const ::String &inName,Dynamic &ioValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 9:
		if (HX_FIELD_EQ(inName,"file_open") ) { file_open=ioValue.Cast< Dynamic >(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *sMemberStorageInfo = 0;
static hx::StaticInfo sStaticStorageInfo[] = {
	{hx::fsObject /*Dynamic*/ ,(void *) &File_obj::file_open,HX_HCSTRING("file_open","\xad","\x4f","\xbf","\x6b")},
	{ hx::fsUnknown, 0, null()}
};
#endif

static void sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(File_obj::__mClass,"__mClass");
	HX_MARK_MEMBER_NAME(File_obj::file_open,"file_open");
};

#ifdef HXCPP_VISIT_ALLOCS
static void sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(File_obj::__mClass,"__mClass");
	HX_VISIT_MEMBER_NAME(File_obj::file_open,"file_open");
};

#endif

hx::Class File_obj::__mClass;

static ::String sStaticFields[] = {
	HX_HCSTRING("read","\x56","\x4b","\xa7","\x4b"),
	HX_HCSTRING("file_open","\xad","\x4f","\xbf","\x6b"),
	::String(null()) };

void File_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("sys.io.File","\xc3","\xef","\x8d","\xeb");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &File_obj::__GetStatic;
	__mClass->mSetStaticField = &File_obj::__SetStatic;
	__mClass->mMarkFunc = sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< File_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = sStaticStorageInfo;
#endif
	hx::RegisterClass(__mClass->mName, __mClass);
}

void File_obj::__boot()
{
	file_open= ::cpp::Lib_obj::load(HX_HCSTRING("std","\xa3","\xa8","\x57","\x00"),HX_HCSTRING("file_open","\xad","\x4f","\xbf","\x6b"),(int)2);
}

} // end namespace sys
} // end namespace io
