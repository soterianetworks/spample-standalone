import {Base} from '../common/base.model';

export class CipUserProfile extends Base {
    userName: string;
    email: string;
    mobile: string;
    firstName: string;
    lastName: string;
    middleName: string;
    country: string;
    language: string;
    expirationDate?: any;
    tenantId: string;
    tenantCode: string;
    tenantDesc: string;
    active: boolean;
    currentBenity: Benity;
    benities: Benity[];
    groups: string[];
    roles: string[];
    permissions: string[];
    departments: Department[];
}

export class Benity {
    id: string;
    code: string;
    name: string;
    shortName: string;
}

export class Department {
    id: string;
    code: string;
    name: string;
    benity?: any;
}

