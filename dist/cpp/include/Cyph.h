// Generated by Haxe 3.4.2
#ifndef INCLUDED_Cyph
#define INCLUDED_Cyph

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS0(Cyph)



class HXCPP_CLASS_ATTRIBUTES Cyph_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef Cyph_obj OBJ_;
		Cyph_obj();

	public:
		enum { _hx_ClassId = 0x2ca57e4e };

		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=false,const char *inName="Cyph")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,false,"Cyph"); }

		hx::ObjectPtr< Cyph_obj > __new() {
			hx::ObjectPtr< Cyph_obj > __this = new Cyph_obj();
			__this->__construct();
			return __this;
		}

		static hx::ObjectPtr< Cyph_obj > __alloc(hx::Ctx *_hx_ctx) {
			Cyph_obj *__this = (Cyph_obj*)(hx::Ctx::alloc(_hx_ctx, sizeof(Cyph_obj), false, "Cyph"));
			*(void **)__this = Cyph_obj::_hx_vtable;
			return __this;
		}

		static void * _hx_vtable;
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~Cyph_obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static bool __SetStatic(const ::String &inString, Dynamic &ioValue, hx::PropertyAccess inCallProp);
		static void __register();
		bool _hx_isInstanceOf(int inClassId);
		::String __ToString() const { return HX_HCSTRING("Cyph","\x4e","\x7e","\xa5","\x2c"); }

		static void __boot();
		static ::Array< ::Dynamic> addressSpace;
		static  ::Dynamic services;
		static  ::Dynamic options;
		static ::String generateGuid(int length);
		static ::Dynamic generateGuid_dyn();

		static void request(::String url,bool post,::Array< ::Dynamic> headers,::Array< ::Dynamic> parameters, ::Dynamic onData, ::Dynamic onError);
		static ::Dynamic request_dyn();

		static  ::Dynamic generateLink(::Array< int > options, ::Dynamic services);
		static ::Dynamic generateLink_dyn();

		static void initiateSession(::String apiKey,::Array< int > options, ::Dynamic services, ::Dynamic onData, ::Dynamic onError);
		static ::Dynamic initiateSession_dyn();

};


#endif /* INCLUDED_Cyph */ 
