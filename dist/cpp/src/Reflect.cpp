// Generated by Haxe 3.4.2
#include <hxcpp.h>

#ifndef INCLUDED_Reflect
#include <Reflect.h>
#endif

HX_LOCAL_STACK_FRAME(_hx_pos_f7db3bba25961ad3_34_field,"Reflect","field",0x54b04da9,"Reflect.field","/usr/share/haxe/std/cpp/_std/Reflect.hx",34,0x95b6af85)

void Reflect_obj::__construct() { }

Dynamic Reflect_obj::__CreateEmpty() { return new Reflect_obj; }

void *Reflect_obj::_hx_vtable = 0;

Dynamic Reflect_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< Reflect_obj > _hx_result = new Reflect_obj();
	_hx_result->__construct();
	return _hx_result;
}

bool Reflect_obj::_hx_isInstanceOf(int inClassId) {
	return inClassId==(int)0x00000001 || inClassId==(int)0x0e2f4039;
}

 ::Dynamic Reflect_obj::field( ::Dynamic o,::String field){
            	HX_STACKFRAME(&_hx_pos_f7db3bba25961ad3_34_field)
HXDLIN(  34)		return hx::IsNull( o ) ? null() : o->__Field(field,hx::paccNever);
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Reflect_obj,field,return )


Reflect_obj::Reflect_obj()
{
}

bool Reflect_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 5:
		if (HX_FIELD_EQ(inName,"field") ) { outValue = field_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *Reflect_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *Reflect_obj_sStaticStorageInfo = 0;
#endif

static void Reflect_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Reflect_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void Reflect_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Reflect_obj::__mClass,"__mClass");
};

#endif

hx::Class Reflect_obj::__mClass;

static ::String Reflect_obj_sStaticFields[] = {
	HX_HCSTRING("field","\xba","\x94","\x93","\x00"),
	::String(null())
};

void Reflect_obj::__register()
{
	hx::Object *dummy = new Reflect_obj;
	Reflect_obj::_hx_vtable = *(void **)dummy;
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("Reflect","\x1d","\xac","\x7a","\xb6");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &Reflect_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = Reflect_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(Reflect_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< Reflect_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = Reflect_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = Reflect_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = Reflect_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

